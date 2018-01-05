package com.isuwang.soa.scala.hello

import com.isuwang.soa.hello.scala.domain.Hello
import com.isuwang.soa.hello.scala.service.HelloServiceAsync
import scala.concurrent.ExecutionContext.Implicits.global

import scala.concurrent.Future

class HelloServiceAsyncImpl extends  HelloServiceAsync{
  /**
    *
    **/
  override def sayHello(hello: Hello, timeout: Long): Future[String] = {
    Future {s" hello: \${hello}, timeout: \${timeout} "}
  }

  /**
    *
    **/
  override def test(content: String, timeout: Long):Future[Unit] = {
    Future {println(s" content: \${content}, timeout: \${timeout}")}
  }
}