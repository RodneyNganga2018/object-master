package io.codingdojo.objectmaster;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMasterApplicationTests {

	@Test
	void contextLoads() {
		Human tester = new Human();
		Human dummie = new Human();
		tester.attack(dummie);
		dummie.displayHealth();
	}

}
