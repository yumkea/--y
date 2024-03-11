package com.yilu.oneroadweb.Controller;

import com.yilu.oneroadweb.Service.UserService;
import com.yilu.oneroadweb.pojo.Result;
import com.yilu.oneroadweb.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController

public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody User user){


        userService.register(user);
        return Result.success("注册成功");
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user) {


        User user1= userService.login(user);
        if(user1==null){
            return Result.error("账号或者密码错误");
        }else {
            return Result.success("登录成功");
        }

    }

}
