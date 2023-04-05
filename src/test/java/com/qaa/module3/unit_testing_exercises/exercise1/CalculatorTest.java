package test.java.com.qaa.module3.unit_testing_exercises.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.qaa.module3.unit_testing_exercises.exercise1.Calculator;

class CalculatorTest {
	
	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	void AddTwoPositiveTest() {
		Assertions.assertEquals(40, calculator.add(30, 10));
	}
	
	@Test
	void AddTwoNegativeTest() {
		Assertions.assertEquals(-40, calculator.add(-30, -10));
	}
	
	@Test
	void AddOnePostiveOneNegativeTest() {
		Assertions.assertEquals(20, calculator.add(30, -10));
	}
	
	@Test
	void AddMaxValueMinValueTest() {
		double value = Double.MAX_VALUE + Double.MIN_VALUE;
		Assertions.assertEquals(value, calculator.add(Double.MAX_VALUE, Double.MIN_VALUE));
	}
	
	@Test
	void AddMinValueMaxValueTest() {
		double value = Double.MIN_VALUE + Double.MAX_VALUE;
		Assertions.assertEquals(value, calculator.add(Double.MIN_VALUE, Double.MAX_VALUE));
	}

	@Test
	void testSubtract() {
		fail("Not yet implemented");
	}
	
	@Test
	void SubtractTwoPositiveTest() {
		Assertions.assertEquals(20, calculator.subtract(30, 10));
	}
	
	@Test
	void SubtractTwoNegativeTest() {
		Assertions.assertEquals(-20, calculator.subtract(-30, -10));
	}
	
	@Test
	void SubtractOnePostiveOneNegativeTest() {
		Assertions.assertEquals(40, calculator.subtract(30, -10));
	}
	
	@Test
	void SubtractMaxValueMinValueTest() {
		double value = Double.MAX_VALUE - Double.MIN_VALUE;
		Assertions.assertEquals(value, calculator.subtract(Double.MAX_VALUE, Double.MIN_VALUE));
	}
	
	@Test
	void SubtractMinValueMaxValueTest() {
		double value = Double.MIN_VALUE - Double.MAX_VALUE;
		Assertions.assertEquals(value, calculator.subtract(Double.MIN_VALUE, Double.MAX_VALUE));
	}

	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}
	
	@Test
	void MultiplyTwoPositiveTest() {
		Assertions.assertEquals(3, calculator.multiply(3, 1));
	}
	
	@Test
	void MultiplyTwoNegativeTest() {
		Assertions.assertEquals(3, calculator.multiply(-3, -1));
	}
	
	@Test
	void MultiplyOnePostiveOneNegativeTest() {
		Assertions.assertEquals(-3, calculator.multiply(3, -1));
	}
	
	@Test
	void MultiplyMaxValueMinValueTest() {
		double value = Double.MAX_VALUE * Double.MIN_VALUE;
		Assertions.assertEquals(value, calculator.multiply(Double.MAX_VALUE, Double.MIN_VALUE));
	}
	
	@Test
	void MultiplyMinValueMaxValueTest() {
		double value = Double.MIN_VALUE * Double.MAX_VALUE;
		Assertions.assertEquals(value, calculator.multiply(Double.MIN_VALUE, Double.MAX_VALUE));
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

}
