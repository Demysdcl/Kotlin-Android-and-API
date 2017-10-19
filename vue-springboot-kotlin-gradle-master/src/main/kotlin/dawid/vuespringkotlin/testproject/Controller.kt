package dawid.vuespringkotlin.testproject

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

	@RequestMapping(value = "/hello", method = arrayOf(RequestMethod.GET), produces = arrayOf("application/json"))
	fun hello() = "{\"message\":\"Hello\"}"

}
