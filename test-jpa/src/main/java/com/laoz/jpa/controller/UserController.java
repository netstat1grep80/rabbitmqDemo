package com.laoz.jpa.controller;

import com.laoz.jpa.domain.User;
import com.laoz.jpa.service.UserService;
import com.laoz.common.domain.R;
import com.laoz.jpa.vo.UserVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: laoz
 * @Time: 2022/7/29  17:01
 * @description:
 */
@RestController
@RequestMapping("/test-jpa")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public R add(@RequestBody User user){
        Long id = userService.add(user);
        if(id != null && id > 0){
            return R.ok();
        }else{
            return R.fail();
        }
    }

    @PutMapping("")
    public R update(@RequestBody User user){
        return userService.updateId(user);
    }

    @GetMapping("/find")
    public R modify(String name){
        return R.ok(userService.getUser(name));
    }

    @GetMapping("/list")
    public R list(UserVO user){
        return R.ok(userService.findAll(user));
    }
}
