package com.example.daocloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Linjiahong
 * 2020/12/15 22:13
 */
@Controller
public class MyController {
    @Autowired
    MySvc mySvc;
    @GetMapping("/")
    public String index() {
        return "hello springboot";
    }
    @GetMapping("/add")
    public String add(int a,int b) {
        return mySvc.add(a,b)+"";
    }
}
