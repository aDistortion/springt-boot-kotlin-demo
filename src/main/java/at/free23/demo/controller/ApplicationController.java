/**
 * 
 */
package at.free23.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import at.free23.demo.kotlin.GreetingService;

/**
 * @author michael.vlasaty
 *
 */
@RestController("/")
public class ApplicationController {

	@Autowired
	private GreetingService service;
	
	@GetMapping("/{name}")
	public String getHelloWorld(@PathVariable("name") String name) {
		return this.service.greet(name);
	}
}
