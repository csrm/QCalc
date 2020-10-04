package com.crio.qcalc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

	@Test
	void testResult() {
		StandardCalculator sCal = new StandardCalculator();
		//Test Case for Add function.
        sCal.add(3,2);
		assertEquals(5,sCal.getResult());
		//Test Case for Subtract function.
		sCal.subtract(5, 6);
		assertEquals(-1,sCal.getResult());
	}

}
