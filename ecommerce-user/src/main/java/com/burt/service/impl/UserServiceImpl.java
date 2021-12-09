package com.burt.service.impl;

import com.burt.mapper.UserMapper;
import com.burt.model.User;
import com.burt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author burt created on 2021/12/8
 * @version $Id$
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long userId){
        return userMapper.selectByPrimaryKey(userId);
    }


}
