package uk.ac.belfastmet.examples1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {

	@Test
	public void test1() {
		String test1 = Brackets.balancedBrackets("[()]");
		
		assertEquals("Balanced",test1);
	}
	
	@Test
	public void test2() {
		String test2 = Brackets.balancedBrackets("{[]}");
		
		assertEquals("Balanced",test2);
	}
	
	@Test
	public void test3() {
		String test3 = Brackets.balancedBrackets("[]{}()");
		
		assertEquals("Balanced",test3);
	}
	
	@Test
	public void test4() {
		String test4 = Brackets.balancedBrackets("[)[)");
		
		assertEquals("Not Balanced",test4);
	}
	
	@Test
	public void test5() {
		String test5 = Brackets.balancedBrackets("()]()");
		
		assertEquals("Not Balanced",test5);
	}
	
	@Test
	public void test6() {
		String test6 = Brackets.balancedBrackets("{[}]");
		
		assertEquals("Not Balanced",test6);
	}
	
	@Test
	public void test7() {
		String test7 = Brackets.balancedBrackets("{({[]}())}");
		
		assertEquals("Balanced",test7);
	}
	@Test
	public void testTooManyParen() {
		String test7 = Brackets.balancedBrackets("((((((((()");
		
		assertEquals("Not Balanced",test7);
	}
	
	@Test
	public void testTooManySquare() {
		String test7 = Brackets.balancedBrackets("[]]]]]]]]");
		
		assertEquals("Not Balanced",test7);
	}
	
	@Test
	public void testTooManyCurly() {
		String test7 = Brackets.balancedBrackets("{{}}}");
		
		assertEquals("Not Balanced",test7);
	}
	
	@Test
	public void testSpaces() {
		String test7 = Brackets.balancedBrackets("{ { }}");
		
		assertEquals("Balanced",test7);
	}
	
	@Test
	public void testOpposites() {
		String test7 = Brackets.balancedBrackets(")}{(");
		
		assertEquals("Not Balanced",test7);
	}


}
