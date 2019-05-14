package com.behavioranalysis.service;

import com.behavioranalysis.pojo.User;

public interface UserService {

    /**
     * 登录业务方法
     * @param upassword
     * @param upassword
     * @return   用户对象   null表示登录失败
     */
    public User login(String uaccount, String upassword);
}
