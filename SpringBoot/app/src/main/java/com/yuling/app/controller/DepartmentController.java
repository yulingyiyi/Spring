package com.yuling.app.controller;

import com.yuling.app.common.ResponseMap;
import com.yuling.app.model.Department;
import com.yuling.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


     @RequestMapping("/all")
    public ResponseMap all(){
         ResponseMap  map = new ResponseMap();
         map.getData().put("list",departmentService.queryAll());
        return map;
     }

}
