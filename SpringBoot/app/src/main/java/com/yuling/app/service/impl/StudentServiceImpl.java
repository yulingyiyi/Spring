package com.yuling.app.service.impl;

import com.yuling.app.mapper.StudentMapper;
import com.yuling.app.model.Student;
import com.yuling.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> queryAll() {
        return  studentMapper.all();
    }
}
