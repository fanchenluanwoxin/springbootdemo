package com.mydemos.springbootdemo.springbootdemo.controll;

import com.mydemos.springbootdemo.springbootdemo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HellowControll {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hellow word !";
    }

    @RequestMapping("/list")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        User u = User.builder().id(Long.valueOf(1)).build();
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
