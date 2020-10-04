package com.crio.qcalc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class QcalcApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testAdd() {
		StandardCalculator sCal = new StandardCalculator();
        sCal.add(1,2);
        assertEquals(3,sCal.getResult());
	}

}
