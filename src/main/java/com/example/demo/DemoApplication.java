package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class DemoApplication extends SpringBootServletInitializer {

	/*public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Xiaopu Jing,1002101563";
	}*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		log.info("Application start successfully");
	}
}
