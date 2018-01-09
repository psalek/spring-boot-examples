
interface MathService {	
	Integer add(Integer a,Integer b)
	Integer multiply(Integer a,Integer b)
	Double divide(Integer a,Integer b)
	Integer substract(Integer a,Integer b)
}

@Service
class MyMathService implements MathService{
	
	Integer add(Integer a, Integer b){
		a + b
	}
	
	Integer multiply(Integer a, Integer b){
		a * b
	}

	Double divide(Integer a, Integer b){
		a / b
	}
	
	Integer substract(Integer a, Integer b){
		a - b
	}
}
