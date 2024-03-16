package com.jpa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//Lombok 플러그인
		// @으로 getter setter를 이용해서 게터세터를 만들어준다.

		//라이브러리 살펴보기
		/**
		 * 히카리CP JDBC 커넥션 툴
		 * Junit : Unit test
		 *
		 * 스프링 데이터 JPA는 스프링과 JPA를 먼저 이해하고 사용해야 하는 응용 기술이다.
		 *
		 *
		 *  timeleaf : 타임리프는 자바 라이브러리이며, 텍스트, HTML, XML, Javascript, CSS 그리고 텍스트를 생성할 수 있는 템플릿 엔진이다.
		 *  스프링 MVC와의 통합 모듈을 제공하며, 애플리케이션에서 JSP로 만든 기능들을 완전히 대체할 수 있다.
		 *  Spring Boot에서는 JSP가 아닌 Thymeleaf 사용을 권장하고 있다.
		 * https://velog.io/@yongseok0419/Spring-Boot-Thymeleaf%EB%9E%80-Thymeleaf-plug-in-install-Thymeleaf-Syntax
		 *
		 * */


		Hello hello = new Hello();
		hello.setData("HSADF");
		String data = hello.getData();

		System.out.println(data);

		SpringApplication.run(DemoApplication.class, args);
	}




}
