package Desafio.CCS.ETL;




import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;

import Desafio.CCS.ETL.Model.Numbers;




@SpringBootApplication
public class Application  implements CommandLineRunner{
	
	public String url = "http://challenge.dienekes.com.br/api/numbers"; //2
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate(); //1
		Numbers[] numbers = restTemplate.getForObject(url, Numbers[].class);
		for(int i = 0; i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
	}
	
}
