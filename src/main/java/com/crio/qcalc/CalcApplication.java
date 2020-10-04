package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc....");
		StandardCalculator sCal = new StandardCalculator();
		sCal.add(1,2);
		System.out.println(sCal.getResult());
	}

}
