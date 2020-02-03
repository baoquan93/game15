package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByUmsMemberId(String UmsMemberId){
        List<UmsMemberReceiveAddress> umsMemberList = userService.getUmsMemberReceiveAddressByUmsMemberId(UmsMemberId);
        return umsMemberList;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String hello(){
        return "hello user";
    }


}
