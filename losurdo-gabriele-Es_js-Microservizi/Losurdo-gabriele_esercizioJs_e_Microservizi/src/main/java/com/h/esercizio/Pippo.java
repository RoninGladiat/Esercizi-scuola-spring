package com.h.esercizio;

import pack_saluto.Saluto;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pippo {

	@CrossOrigin(origins = "*")
	
	@GetMapping("/messaggio")
	public String messaggio() {
		
		Saluto saluto = new Saluto();
		
		saluto.setContenuto("Colamonico");
		saluto.setId(1997);
		
		JSONObject salutojson = new JSONObject(saluto);
		
		return salutojson.toString();		
		
		
	}
		
}
