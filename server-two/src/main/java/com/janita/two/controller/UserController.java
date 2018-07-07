package com.janita.two.controller;

import com.janita.common.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018/7/8
 *
 * @author Janita
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User findUser(){
        User user = new User();
        user.setName("a");
        return user;
    }

}
