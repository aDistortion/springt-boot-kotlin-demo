/**
 * 
 */
package at.free23.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import at.free23.demo.kotlin.GreetingService;
import at.free23.demo.kotlin.model.Greeting;
import at.free23.demo.kotlin.model.HistoricGreeting;

/**
 * @author michael.vlasaty
 *
 */
@RestController("/")
public class ApplicationController {

	@Autowired
	private GreetingService service;
	
	private List<HistoricGreeting> greetz = new ArrayList<HistoricGreeting>();

	@GetMapping("/{name}")
	public String getHelloWorld(@PathVariable("name") String name) {
		final Greeting greets = new Greeting(name);
		greetz.add(greets.map((g) -> new HistoricGreeting(g.getName())));
		return this.service.greet(name);
	}
}
