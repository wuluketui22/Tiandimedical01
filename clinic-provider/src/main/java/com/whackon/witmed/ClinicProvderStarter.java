package com.whackon.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.whackon.witmed.clinic.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ClinicProvderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ClinicProvderStarter.class, args);
	}
}
