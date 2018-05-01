package at.free23.demo.kotlin.model

import java.time.LocalDateTime

data class HistoricGreeting(val name: String) {
	val dts: LocalDateTime = LocalDateTime.now();
}
