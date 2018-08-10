package com.yuling.app.controller;

import com.yuling.app.common.ResponseMap;
import com.yuling.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    private ResponseMap responseMap = new ResponseMap();

    @RequestMapping("/all")
    public ResponseMap all(){
//        ResponseMap map = new ResponseMap();
        responseMap.setResponse("list",studentService.queryAll());
        return responseMap;
    }


}
