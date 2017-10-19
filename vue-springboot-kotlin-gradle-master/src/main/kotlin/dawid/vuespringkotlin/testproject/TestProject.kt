package dawid.vuespringkotlin.testproject

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TopDine

fun main(args: Array<String>) {
	SpringApplication.run(TopDine::class.java, *args)
}
