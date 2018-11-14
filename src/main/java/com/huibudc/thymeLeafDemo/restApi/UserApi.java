package com.huibudc.thymeLeafDemo.restApi;

import com.alibaba.fastjson.JSON;
import com.huibudc.thymeLeafDemo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/api")
public class UserApi {
    @RequestMapping("/list")
    public String listUser() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userList.add(new User(i, "张三" + i, 20 + i, "中国广州"));
        }
        return JSON.toJSONString(userList);
    }
}
