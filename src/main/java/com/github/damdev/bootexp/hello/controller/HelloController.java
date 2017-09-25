package com.github.damdev.bootexp.hello.controller;

import com.github.damdev.bootexp.hello.model.Hello;
import com.github.damdev.bootexp.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public @ResponseBody Hello hello(@RequestParam String name) {
        return helloService.inflateHello(name);
    }
    @RequestMapping("/hello.html")
    public String helloView(@RequestParam String name, Model model) {
        model.addAttribute("hello", helloService.inflateHello(name));
        return "helloView";
    }

}
