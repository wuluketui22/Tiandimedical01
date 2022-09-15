package com.whackon.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * patient生产者启动类
 */
@MapperScan("com.whackon.witmed.dao.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class PatientProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(PatientProviderStarter.class, args);
	}
}
