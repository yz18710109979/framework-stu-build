package com.framework.alipay.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("index");
        return "index";}
}
