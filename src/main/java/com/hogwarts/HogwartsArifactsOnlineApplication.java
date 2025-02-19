package com.hogwarts;

import com.hogwarts.artifact.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsArifactsOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HogwartsArifactsOnlineApplication.class, args);
	}

	@Bean
	public IdWorker idWorker(){
		return new IdWorker(1,1);
	}

}
