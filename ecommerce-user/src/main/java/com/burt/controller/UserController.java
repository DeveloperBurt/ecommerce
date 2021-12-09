package com.burt.controller;

import com.burt.model.User;
import com.burt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author burt created on 2021/12/8
 * @version $Id$
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String getUser(){
        User user = userService.getUserById(1L);
        return user.getName();
    }

}
