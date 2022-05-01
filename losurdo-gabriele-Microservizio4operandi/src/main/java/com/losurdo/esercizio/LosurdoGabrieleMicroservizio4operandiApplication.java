package com.losurdo.esercizio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LosurdoGabrieleMicroservizio4operandiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LosurdoGabrieleMicroservizio4operandiApplication.class, args);
	}
	
	@RequestMapping("/somma")
	public @ResponseBody String somma(@RequestParam (value = "num1", defaultValue = "0") float numero1, @RequestParam (value = "num2", defaultValue = "0") float numero2) {
		
		float som = numero1+numero2;
		
		return "La somma è uguale a: " + String.valueOf(som);
	}
	
	@RequestMapping("/divisione")
	public @ResponseBody String differenza(@RequestParam(value = "num1", defaultValue = "0") float numero1, @RequestParam (value = "num2", defaultValue = "0") float numero2) {
		
		float dif = numero1/numero2;
		
		return "La divisione è uguale a: " + String.valueOf(dif);
	}
	
	@RequestMapping("/prodotto")
	public @ResponseBody String prodotto(@RequestParam(value = "num1", defaultValue = "0") float numero1, @RequestParam (value = "num2", defaultValue = "0") float numero2) {
		
		float pro = numero1*numero2;
		
		return "Il prodotto è uguale a: " + String.valueOf(pro);
	}
	
	@RequestMapping("/sottrazione")
	public @ResponseBody String sottrazione(@RequestParam(value = "num1", defaultValue = "0") float numero1, @RequestParam (value = "num2", defaultValue = "0") float numero2) {
		
		float sot = numero1-numero2;

		return "La sottrazione è uguale a: " + String.valueOf(sot);
	}
	

}
