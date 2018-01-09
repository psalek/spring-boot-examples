package io.pivotal.web.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

	//Checking status of this service
	public Code getStatus() {
		return Code.randomCode();
	}

	//More Methods here....
	
	public static enum Code {
		OK, FAIL, UNREACHABLE;
		
		//Mocking Code return
		private static final List<Code> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();
		
		public static Code randomCode()  {
		    return VALUES.get(RANDOM.nextInt(SIZE));
		 }
	}
}

