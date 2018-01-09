//app.groovy
@RestController
class SimpleWebApp{
    @RequestMapping("/")
    String greetings(){
       "Spring Boot Rocks!"
    }
}
