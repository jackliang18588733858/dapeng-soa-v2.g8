
        package com.isuwang.soa.hello.scala.service

        import com.isuwang.dapeng.core.{Processor, Service}
        import com.isuwang.dapeng.core.SoaGlobalTransactional
        import scala.concurrent.Future

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 Hello Service

        **/
        @Service(name ="com.isuwang.soa.hello.service.HelloService" , version = "1.0.0")
        @Processor(className = "com.isuwang.soa.hello.scala.HelloServiceAsyncCodec\$Processor")
        trait HelloServiceAsync {
        
            /**
            * 
            **/
            
            @throws[com.isuwang.dapeng.core.SoaException]
            def sayHello(
            hello: com.isuwang.soa.hello.scala.domain.Hello , timeout : Long): Future[String]

          
            /**
            * 
            **/
            
            @throws[com.isuwang.dapeng.core.SoaException]
            def test(
            content: String , timeout : Long): Future[Unit]

          
      }
      