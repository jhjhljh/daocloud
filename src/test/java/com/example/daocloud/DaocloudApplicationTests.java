package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaocloudApplicationTests {
	@Autowired
	MySvc mySvc;

	@Test
	void addTest() {
		int res = mySvc.add(120,240);
		assert res == 360;
	}

}
