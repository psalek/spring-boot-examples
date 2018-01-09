import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//Added by Spring Boot
@Grab('spring-boot-starter-web')

//Added by Spring Boot
@EnableAutoConfiguration

@RestController
class SimpleWebApp{
    @RequestMapping("/")
    String greetings(){
        "Spring Boot Rocks!"
    }
                        
    //Added by Spring Boot
    static void main(String[] args){
        SpringApplication.run SimpleWebApp, args
    }
}
