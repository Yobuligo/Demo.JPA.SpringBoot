package com.vpsd.myfitsters.greeting;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public Greeting getGreeting() {
		return new Greeting(1, "Hello World");
	}

	@RequestMapping("/greetings")
	public List<Greeting> getGreetings() {
		List<Greeting> greetingList = new ArrayList<Greeting>();
		greetingList.add(new Greeting(1, "Peter"));
		greetingList.add(new Greeting(2, "Marianne"));
		return greetingList;
	}
}
