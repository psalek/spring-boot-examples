
@Grab('spring-boot-starter-security')

@RestController
class WebApp{
    @RequestMapping('/')
    String index(){
       "Hello World! - Secured"
    }
}
