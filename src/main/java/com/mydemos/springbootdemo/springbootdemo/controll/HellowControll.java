package com.mydemos.springbootdemo.springbootdemo.controll;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HellowControll {

    @RequestMapping("/hello")
    public String hello(){
        return "hellow word !";
    }

    @RequestMapping("/list")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
