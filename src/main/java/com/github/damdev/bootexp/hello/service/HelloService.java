package com.github.damdev.bootexp.hello.service;

import com.github.damdev.bootexp.hello.model.Hello;
import org.springframework.stereotype.Service;

public interface HelloService {

    public Hello inflateHello(String name);
}
