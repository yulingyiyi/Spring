package com.yuling.app.service.impl;

import com.yuling.app.mapper.DepartmentMapper;
import com.yuling.app.model.Department;
import com.yuling.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> queryAll() {
        return departmentMapper.selectAll();
    }

    @Override
    public boolean add(Department department) {
        return departmentMapper.insert(department) == 1;
    }
}
