package abelova.springeventsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "abelova.springeventsdemo.domain")
@SpringBootApplication
public class SpringEventsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsDemoApplication.class, args);
	}

}
