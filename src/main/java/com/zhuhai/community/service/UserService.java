package com.zhuhai.community.service;

import com.zhuhai.community.mapper.UserMapper;
import com.zhuhai.community.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 用户用户id查询用户
     * @param id
     * @return
     */
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
