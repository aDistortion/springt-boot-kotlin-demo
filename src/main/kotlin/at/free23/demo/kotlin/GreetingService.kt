package at.free23.demo.kotlin

import org.springframework.stereotype.Service

fun getLocalGreeting(): String {
	return "Hello";
}
@Service
class GreetingService {
	fun greet(name: String): String {
		return getLocalGreeting()+" "+name+"!";
	}
}