package com.rdp.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 10011531
 */
@SpringBootApplication(scanBasePackages = {"cn.tim.*", "rdp.*"})
@MapperScan("cn.tim.mapper")
public class RdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdpApplication.class, args);
	}

}
