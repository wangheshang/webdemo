package com.shun.study.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class CommonController {

    @RequestMapping("lunbo")
    public String lunbo(){
        return "lunbo/lunbo";
    }
    @RequestMapping("lunboMobile")
    public String lunboMobile(){
        return "lunbo/lunboMobile";
    }



}
