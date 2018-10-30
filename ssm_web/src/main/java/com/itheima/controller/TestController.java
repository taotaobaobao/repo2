package com.itheima.controller;


import com.itheima.Account;
import com.itheima.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/findAll")
    public  String testFind(){
        List<Account> accounts = testService.testFindAll();
        System.out.println(accounts);
        return "success";
    }
}
