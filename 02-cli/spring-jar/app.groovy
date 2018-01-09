
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
	
	@RequestMapping('/multiply/{a}/{b}')
	String multiply(@PathVariable Integer a, @PathVariable Integer b){
		"Result: ${service.multiply(a,b)}"
	}
	
	@RequestMapping('/divide/{a}/{b}')
	String division(@PathVariable Integer a, @PathVariable Integer b){
		"Result: ${service.divide(a,b)}"
	}
	
	@RequestMapping('/substract/{a}/{b}')
	String substract(@PathVariable Integer a, @PathVariable Integer b){
		"Result: ${service.substract(a,b)}"
	}

}
