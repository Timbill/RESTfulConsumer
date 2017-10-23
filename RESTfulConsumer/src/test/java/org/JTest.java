package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.Consumer;
import com.Country;

@RunWith(MockitoJUnitRunner.class)
@Configuration
public class JTest {
   @Test
   public void testGetDisplayName() {
	   
       RestTemplate restTemplate = new RestTemplate();
       Country country = restTemplate.getForObject("http://localhost:8080/SpringRestfulWebServicesCRUDExample/country/1", Country.class);
	   assertEquals("Canada", country.getCountryName());
}
}
