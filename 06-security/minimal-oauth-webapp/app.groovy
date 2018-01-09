
@Grab('spring-boot-starter-security')
@Grab('spring-security-oauth2')

@RestController
@EnableAuthorizationServer
@EnableResourceServer
class WebApp{
    @RequestMapping('/')
    String index(){
       "Hello World! - Secured"
    }
}
