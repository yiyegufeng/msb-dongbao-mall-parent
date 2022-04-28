package com.msb.msbdongbaogeverator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MsbDongbaoGeveratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsbDongbaoGeveratorApplication.class, args);
	}

}
