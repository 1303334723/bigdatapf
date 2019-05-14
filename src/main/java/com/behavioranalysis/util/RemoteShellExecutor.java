package com.behavioranalysis.util;


import ch.ethz.ssh2.ChannelCondition;
import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class RemoteShellExecutor {

    private Connection conn;
    // 远程主机IP
    private String ip;
    // 用户名
    private String osUsername;
    // 密码
    private String password;
    private String charset = Charset.defaultCharset().toString();

    private static final int TIME_OUT = 1000 * 5 * 60;

    /**
     * 构造函数
     * @param ip
     * @param osUsername
     * @param password
     */
    public RemoteShellExecutor(String ip, String osUsername, String password) {
        this.ip = ip;
        this.osUsername = osUsername;
        this.password = password;
    }

    /**
     * 登录
     * @return
     * @throws IOException
     */
    private boolean login() throws IOException {
        conn = new Connection(ip);
        conn.connect();
        return conn.authenticateWithPassword(osUsername, password);
    }

    public int exec(String cmds) throws Exception {
        InputStream stdOut = null;
        InputStream stdErr = null;
        String outStr = "";
        String outErr = "";
        int ret = -1;
        try {
            if (login()) {
                // Open a new {@link Session} on this connection
                Session session = conn.openSession();
                // Execute a command on the remote machine
                session.execCommand(cmds);

                stdOut = new StreamGobbler(session.getStdout());
                outStr = processStream(stdOut, charset);

                stdErr = new StreamGobbler(session.getStderr());
                outErr = processStream(stdErr, charset);

                session.waitForCondition(ChannelCondition.EXIT_STATUS, TIME_OUT);

                System.out.println("outStr : " + outStr);
                System.out.println("outErr : " + outErr);

                ret = session.getExitStatus();
                /**
                 * 说明：
                 * 0 // getExitStatus方法的返回值
                 *
                 * 注：一般情况下shell脚本正常执行完毕，getExitStatus方法返回0。
                 * 此方法通过远程命令取得Exit Code/status。但并不是每个server设计时都会返回这个值，如果没有则会返回null。
                 * 在调用getExitStatus时，要先调用WaitForCondition方法，通过ChannelCondition.java接口的定义可以看到每个条件的具体含义。见以下代码：
                 * ChannelCondition.java的源代码
                 */
            } else {
                throw new Exception("登录远程机器失败" + ip);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            IOUtils.closeQuietly(stdOut);
            IOUtils.closeQuietly(stdErr);
        }
        return ret;
    }

    /**
     * @param in
     * @param charset
     * @return
     * @throws Exception
     */
    private String processStream(InputStream in, String charset) throws Exception {
        byte[] buf = new byte[1024];
        StringBuilder sb = new StringBuilder();
        while (in.read(buf) != -1) {
            sb.append(new String(buf, charset));
        }
        return sb.toString();
    }
}
