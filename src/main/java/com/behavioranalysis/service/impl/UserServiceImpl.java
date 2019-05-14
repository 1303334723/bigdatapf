package com.behavioranalysis.service.impl;

import com.behavioranalysis.mapper.UserMapper;
import com.behavioranalysis.pojo.User;
import com.behavioranalysis.pojo.UserExample;
import com.behavioranalysis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired  // 自动注入 在spring容器中查找userMapper实例并赋值
    private UserMapper userMapper;  // 在spring容器中

    @Override
    public User login(String uaccount, String upassword) {
        // 创建查询条件的封装对象
        UserExample example = new UserExample();

        // Criteria是一个条件的封装类，并且是一个内部类
        UserExample.Criteria criteria = example.createCriteria();
        // 拼接用户条件（精确查询）
        criteria.andUaccountEqualTo(uaccount);  //假设用户名有唯一约束
        criteria.andUpasswordEqualTo(upassword);
        List<User> list = userMapper.selectByExample(example);
        if(list != null && list.size() > 0) { //登陆成功
            return list.get(0);
        }
        return null; //登录失败
    }
}
