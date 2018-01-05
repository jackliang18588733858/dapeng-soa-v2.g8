package com.isuwang.soa.scala.hello

import com.isuwang.soa.hello.scala.domain.Hello
import com.isuwang.soa.hello.scala.service.HelloService
import javax.annotation.Resource
import javax.sql.DataSource

import com.isuwang.soa.hello.scala.service.HelloService
import wangzx.scala_commons.sql._
import entity.Company


class HelloServiceImpl extends HelloService {

  @Resource(name = "crm_dataSource")
  var dataSource: DataSource = _

  /**
    *
    **/
  override def sayHello(hello: Hello): String = {
    val company = dataSource.row[Company](sql" select * from companys where id = 119501")
    println(s" companyInfo: \${company}")
    company match {
      case Some(c) => c.toString
      case None => ""
    }
  }

  /**
    *
    **/
  override def test(content: String): Unit = {
    println(s" received content: \${content}")
  }
}
