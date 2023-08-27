package com.ohmin839.jybuben.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableBatchProcessing // not working with this annotation since 5.0
public class JybubenBatchApplication {


	public static void main(String[] args) {
		SpringApplication.run(JybubenBatchApplication.class, args);
	}
}
