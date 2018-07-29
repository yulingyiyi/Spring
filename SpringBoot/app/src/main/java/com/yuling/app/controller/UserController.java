package com.yuling.app.controller;

import com.yuling.app.common.ResponseMap;
import com.yuling.app.model.User;
import com.yuling.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String login(){
        return "user_index";
    }
    @RequestMapping("/info")
    public ResponseMap info(@RequestParam int id){
        System.out.print(id);
        User user = userService.queryById(id);
        ResponseMap map = new ResponseMap();
        if (user.getId() > 0){
            map.getData().put("user",user);
        }else {
            map.setMessage("查无此人");
            map.setCode(10001);
        }
        System.out.print("11111111111111111111111");
        return map;
    }
//    @RequestMapping("/info")
//    public Map<String,String> info(@RequestParam String name){
//        Map<String,String> map = new HashMap<>();
//        map.put("name",name);
//        return map;
//    }
    @RequestMapping("/getList")
    public List<Map<String,String>> getList(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = null;
        for (int i = 0; i < 5; i++) {
            map = new HashMap<>();
            map.put("name","name-"+1);
            list.add(map);
        }
        return list;
    }
    @RequestMapping("/all")
    public List<User> all(){
//        List<User> list = new ArrayList<>();
//        User map = null;
//        for (int i = 0; i < 5; i++) {
//            map = new User();
//             map.setId(i+10000);
//             map.setUsername(1+"1000");
//            list.add(map);
//        }
//        return list;
        return userService.queryAll();
    }

}
