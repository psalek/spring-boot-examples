
@RestController
class MathWebApp {
	
	@Autowired
	MathService service
	
	@RequestMapping('/')
	String index(){
		"Math Service"
	}
	
	
	@RequestMapping('/add/{a}/{b}')
	String add(@PathVariable Integer a, @PathVariable Integer b){
		"Result: ${service.add(a,b)}"
	}

}
