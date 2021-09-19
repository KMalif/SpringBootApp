package plugin.backend.spring_boot_api


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping
    fun sayHello(): String = """
        hi KMalif,
         this is your first Spring Boot App
         Keep it up, lets go
    """
}