package com.yuling.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class PageController {

    @Value("${application.hell:hello Shanhy}")
    private String hello = "hello Shanhy";
//
//    @RequestMapping(value = {"/","/index"})
//    public String index(Map<String,Object> model){
//
//        model.put("time",new Date());
//        model.put("message",this.hello);
//
//        return "/index.html";
//    }
//    @RequestMapping("page1")
//    public ModelAndView page1(){
//        System.out.print("1111111111111111111111111");
//        ModelAndView mav = new ModelAndView("jsps/page1");
//        mav.addObject("content", hello);
//        return mav;
//    }
     @GetMapping("/html")
    public String html(){
        return "/index.html";
   }




}
