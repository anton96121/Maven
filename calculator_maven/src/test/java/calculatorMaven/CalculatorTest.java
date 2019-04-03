package calculatorMaven;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Claculator;
import calculator.operations.Addition;
import calculator.operations.Operation;

public class CalculatorTest {

	@Test
	public void test() {
		
	// Addition tested
		Operation f = Operation.parseOperator("+");
		f.setNumbers(3.0, 6.0);
		
		assertEquals(9.0,f.calc(),0.0);
		
		assertEquals(f.getOperator(),"+");
		
		
		assertEquals(f.getName(),"addition");
		
	// Multiplication tested
		Operation g = Operation.parseOperator("*");
		g.setNumbers(3.0, 6.0);
		
		assertEquals(18.0,g.calc(),0.0);
		
		assertEquals(g.getOperator(),"*");
		
		
		assertEquals(g.getName(),"multiplication");
		
	// null 
		Operation h = Operation.parseOperator("gf");
		assertEquals(h,null);
	}

}
