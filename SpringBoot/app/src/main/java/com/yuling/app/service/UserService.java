package com.yuling.app.service;

import com.yuling.app.model.User;

import java.util.List;

public interface UserService {


    User queryById(int id);
    List<User> queryAll();


}
