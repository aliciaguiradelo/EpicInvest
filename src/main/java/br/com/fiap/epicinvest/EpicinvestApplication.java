package br.com.fiap.epicinvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;;


@SpringBootApplication
@Controller
public class EpicinvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpicinvestApplication.class, args);
	}

	@GetMapping
	public String home(){
		return "index";
	}

}
