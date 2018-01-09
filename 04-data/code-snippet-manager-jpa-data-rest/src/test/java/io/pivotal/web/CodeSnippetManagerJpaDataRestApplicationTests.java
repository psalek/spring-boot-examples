package io.pivotal.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import io.pivotal.web.repository.SnippetRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CodeSnippetManagerJpaDataRestApplication.class)
@WebAppConfiguration
public class CodeSnippetManagerJpaDataRestApplicationTests {

	@Autowired
	SnippetRepository repo;
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void repoTest() throws Exception {
		assert repo != null;
		assert 4 == repo.count();	
	}
	
	@Test
	public void restTest() throws Exception {
		ResultActions resultActions = mockMvc.perform(get("/snippets").accept(MediaType.ALL));
	    resultActions.andExpect(status().isOk());
	}

}
