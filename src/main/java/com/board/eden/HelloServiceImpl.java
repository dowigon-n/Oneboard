package com.board.eden;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() 메서드 실행");
		String message = "Hello~~~" + name;
		return message;
	}

}
