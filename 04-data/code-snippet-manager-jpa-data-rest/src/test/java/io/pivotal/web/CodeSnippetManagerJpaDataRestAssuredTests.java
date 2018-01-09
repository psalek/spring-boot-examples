package io.pivotal.web;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CodeSnippetManagerJpaDataRestApplication.class)
@WebIntegrationTest("server.port:0")
public class CodeSnippetManagerJpaDataRestAssuredTests {

	@Autowired
    private WebApplicationContext context;
	
	@Before
    public void setUp() {
		RestAssuredMockMvc.mockMvc(MockMvcBuilders.webAppContextSetup(context).build());
	}
	
	@Test
	public void getAllTest(){
		when().
        	get("/snippets").
        then().
        	assertThat(status().isOk()).
        	body("_links.self.href", equalTo("http://localhost/snippets"));
	}
}
