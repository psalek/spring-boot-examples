
@RestController
class SimpleWebApp {
	
	@Autowired
	SimpleService service
	
	@Value('${greetings:Hello}')
	private String greetings

	@RequestMapping('/')
	String index(){
		"$greetings: ${service.message}"
	}

}
