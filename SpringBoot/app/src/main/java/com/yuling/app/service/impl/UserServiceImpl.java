package com.yuling.app.service.impl;

import com.yuling.app.mapper.UserMapper;
import com.yuling.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.jdbc.core.JdbcTemplate;
import com.yuling.app.service.UserService;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public User queryById(int id) {
        String sql = "SELECT * FROM User WHERE id = " + id;
//        User user = new User();
//        user.setId(id);
//        return   userMapper.selectByPrimaryKey(user);

        List<User> list=jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {

                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setAge(resultSet.getInt("age"));

                return user;
            }
        });

        if (list.isEmpty()){
            return   new User();
        }
        return list.get(0);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}

