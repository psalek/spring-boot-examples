package io.pivotal.messaging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.pivotal.messaging.SimpleRabbitApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SimpleRabbitApplication.class)
public class SimpleRabbitApplicationTests {

	@Test
	public void contextLoads() {
	}

}
