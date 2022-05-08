package com.board.eden;

public class HelloController {
	
	HelloService helloService = new HelloServiceImpl();   // 필요한 객체를 직접 생성해서 사용함
	
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}

}
