package at.free23.demo.kotlin.model

data class Greeting(val name: String) {
	fun <T> map(fn: (greeting: Greeting) -> T): T {
		return fn(this);
	}

	override fun toString(): String {
		return "Hello "+name+"!";
	}
}
