package com.rdp.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 10011531
 */
@SpringBootApplication(scanBasePackages = {"com.rdp.*", "rdp.*"})
@MapperScan("com.rdp.system.mapper")
public class RdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdpApplication.class, args);
	}

}
