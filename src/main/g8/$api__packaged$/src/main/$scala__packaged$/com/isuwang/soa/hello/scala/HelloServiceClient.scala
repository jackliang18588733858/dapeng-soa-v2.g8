package com.isuwang.soa.hello.scala

        import com.isuwang.dapeng.core._;
        import com.isuwang.org.apache.thrift._;
        import java.util.ServiceLoader;
        import com.isuwang.soa.hello.scala.HelloServiceCodec._;
        import com.isuwang.soa.hello.scala.service.HelloService;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        class HelloServiceClient extends HelloService {

        import java.util.function.{ Function ⇒ JFunction, Predicate ⇒ JPredicate, BiPredicate }
          implicit def toJavaFunction[A, B](f: Function1[A, B]) = new JFunction[A, B] {
          override def apply(a: A): B = f(a)
        }

          val serviceName = "com.isuwang.soa.hello.scala.service.HelloService"
          val version = "1.0.0"
          val pool = {
            val serviceLoader = ServiceLoader.load(classOf[SoaConnectionPoolFactory])
          if (serviceLoader.iterator().hasNext) {
          val poolImpl = serviceLoader.iterator().next().getPool
          poolImpl.registerClientInfo(serviceName,version)
          poolImpl
          } else null
           }

        def getServiceMetadata: String = {
        pool.send(
          serviceName,
          version,
          "getServiceMetadata",
          new getServiceMetadata_args,
          new GetServiceMetadata_argsSerializer,
          new GetServiceMetadata_resultSerializer
        ).success
        }


        
             /**
             * 
             **/
            def sayHello(hello:com.isuwang.soa.hello.scala.domain.Hello ) : String = {

              val response = pool.send(
              serviceName,
              version,
              "sayHello",
              sayHello_args(hello),
              new SayHello_argsSerializer(),
              new SayHello_resultSerializer())

              response.success

            }
          
             /**
             * 
             **/
            def test(content:String ) : Unit = {

              val response = pool.send(
              serviceName,
              version,
              "test",
              test_args(content),
              new Test_argsSerializer(),
              new Test_resultSerializer())

              

            }
          
      }
      