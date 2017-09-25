package com.github.damdev.bootexp.hello.service;

import com.github.damdev.bootexp.hello.model.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public Hello inflateHello(String name) {
        return new Hello(name);
    }
}
