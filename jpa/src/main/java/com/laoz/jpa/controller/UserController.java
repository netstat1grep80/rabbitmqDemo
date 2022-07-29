package com.laoz.jpa.controller;

import com.laoz.jpa.service.UserService;
import com.laoz.mq.common.domain.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: laoz
 * @Time: 2022/7/29  17:01
 * @description:
 */
@RestController
@RequestMapping("/jpa")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/test")
    public R test(Long id , Integer age){
        try {
            return userService.updateId(id, age);
        }catch (Exception e){
            return R.fail(e.getMessage());
        }
    }
}
