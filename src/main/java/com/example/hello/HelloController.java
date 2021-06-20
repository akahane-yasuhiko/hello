package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String top(){
        System.out.println("hoge");
        return "hello!";
    }
}
