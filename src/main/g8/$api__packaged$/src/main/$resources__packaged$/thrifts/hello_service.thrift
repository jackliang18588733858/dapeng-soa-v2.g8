namespace java $organization$.soa.hello.service

include "hello_domain.thrift"

service HelloService {

    hello_domain.Hello sayHello(1: string content)

}