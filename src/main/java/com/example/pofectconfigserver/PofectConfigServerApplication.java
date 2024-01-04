package com.example.pofectconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PofectConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PofectConfigServerApplication.class, args);
	}

}
