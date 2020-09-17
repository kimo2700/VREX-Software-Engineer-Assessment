package com.assessment.webservice;

import com.assessment.webservice.model.Command;
import com.assessment.webservice.model.Respond;
import com.assessment.webservice.service.WebService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebServiceApplicationTests {
	WebService webService = new WebService();
	Map<String, ArrayList<Command>> input = new HashMap<>();
	Map<String, Respond> ouput;
	ArrayList<Command> a = new ArrayList<>();
	ArrayList<Command> b = new ArrayList<>();



	@Test
	void contextLoads() {

		a.add(new Command("me","CNN"));
		a.add(new Command("you","FOX"));
		a.add(new Command("she","CNN"));
		b.add(new Command("kimo","CNN"));
		input.put("New york",a);
		input.put("alabama",b);
		ouput= webService.getTop(input);
		String expected = ouput.get("New york").getMostFrequentCommand();// calling the service method
		String actual = "CNN";// top Most command in state of new york is CNN
		assertEquals(expected,actual);

	}

}
