package com.isuwang.soa.hello;

import com.isuwang.dapeng.core.SoaException;
import com.isuwang.soa.hello.domain.Hello;
import com.isuwang.soa.hello.service.HelloServiceAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class HelloServiceAsyncImpl implements HelloServiceAsync {
    @Override
    public Future<String> sayHello(Hello hello, long timeout) throws SoaException {
        return CompletableFuture.supplyAsync(() -> hello.toString());
    }

    @Override
    public Future<Void> test(String content, long timeout) throws SoaException {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(" Hello world: " + content);
            return null;
        });
    }
}
