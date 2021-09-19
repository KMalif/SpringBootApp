package plugin.backend.spring_boot_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootApiApplication

fun main(args: Array<String>) {
	runApplication<SpringBootApiApplication>(*args)
}
