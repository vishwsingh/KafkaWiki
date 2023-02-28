package com.example.kafkawiki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkawikiApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkawikiApplication.class, args);
	}

}
