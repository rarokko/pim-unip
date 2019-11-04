package com.unip.pimfrotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.unip.pimfrotas.controller.DbConnection;

@SpringBootApplication

public class PimFrotasApplication {
	public static void main(String[] args) {
		SpringApplication.run(PimFrotasApplication.class, args);
	}
}
