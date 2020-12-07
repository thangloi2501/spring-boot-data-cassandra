package com.bezkoder.spring.data.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bezkoder.spring.data.cassandra")
public class SpringBootDataCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataCassandraApplication.class, args);
	}

}
