package com.huaqi.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huaqi.web.dao")
public class HuaQiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuaQiApplication.class, args);
	}

}
