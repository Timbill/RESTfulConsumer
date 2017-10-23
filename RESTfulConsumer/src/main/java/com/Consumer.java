package com;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

	public class Consumer {
////
	    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

	    public static void main(String args[]) {
	        RestTemplate restTemplate = new RestTemplate();
	        Country country = restTemplate.getForObject("http://localhost:8080/SpringRestfulWebServicesCRUDExample/country/2", Country.class);
	        log.info(country.toString());
//	        Countries countries = restTemplate.getForObject("http://localhost:8080/SpringRestfulWebServicesCRUDExample/countries", Countries.class);
//	        log.info(countries.toString());
	        
	        Map<String, String> params = new HashMap<String, String>();
	        params.put("id", "7");
	             
	        Country country2 = new Country();
	        country2.setId("7");
	        country2.setCountryName("US");
	        country2.setPopulation("350");
	             
	        RestTemplate restTemplate2 = new RestTemplate();
	        restTemplate2.put ( "http://localhost:8080/SpringRestfulWebServicesCRUDExample/countries", country2, params);
	        
	        Country country3 = restTemplate.getForObject("http://localhost:8080/SpringRestfulWebServicesCRUDExample/country/7", Country.class);
	        log.info(country3.toString());

	    }

	}
