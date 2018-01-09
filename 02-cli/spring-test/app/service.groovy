
interface MathService {	
	Integer add(Integer a,Integer b)
}

@Service
class MyMathService implements MathService{
	
	Integer add(Integer a, Integer b){
		a + b
	}

}
