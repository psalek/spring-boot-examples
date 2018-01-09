
class MathServiceTest {

	private MathWebApp webapp
	private MathService mathService
	
	@Before
	void setUp() {
		webapp = new MathWebApp()
		mathService = new MyMathService()
	}

	@Test
	void webappTest(){
		assertNotNull webapp
		assertEquals webapp.index(),"Math Service"
	}

	@Test
	void mathServiceAddTest() {
	    assertNotNull mathService
	   	assertEquals mathService.add(5,5),10
	}

}