
@Grab('spring-boot-starter-actuator')

@RestController
class SimpleWebApp {

  @RequestMapping('/')
  String index(){
     "Hello Actuator!!"
  }

}
