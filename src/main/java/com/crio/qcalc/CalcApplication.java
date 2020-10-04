package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc.....");
		StandardCalculator sCal = new StandardCalculator();
		sCal.add(Integer.MAX_VALUE,23);
		System.out.println(sCal.getResult());
		sCal.subtract(Integer.MIN_VALUE, 1);
		System.out.println(sCal.getResult());
	}

}
