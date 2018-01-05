package com.isuwang.soa.hello;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.soa.hello.domain.Hello;
import com.isuwang.soa.hello.service.HelloService;

public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(Hello hello) throws SoaException {
        return "hello: " + hello.toString();
    }

    @Override
    public void test(String content) throws SoaException {
        System.out.println(" hello world: " + content);
    }
}
