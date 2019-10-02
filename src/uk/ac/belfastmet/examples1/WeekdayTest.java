package uk.ac.belfastmet.examples1;

import java.util.ArrayList;

public class WeekdayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekdayTest weekdayTest= new WeekdayTest();
//		System.out.println(weekdayTest.sleepIn(false,false));
//		System.out.println(weekdayTest.sleepIn(true,false));
//		System.out.println(weekdayTest.sleepIn(false,true));
//		
//		System.out.println(weekdayTest.missingChar("kitten",1));
//		System.out.println(weekdayTest.missingChar("kitten",0));
//		System.out.println(weekdayTest.missingChar("kitten",4));
//		
//		System.out.println("Does it start with hi? " + weekdayTest.startsHi("hi there"));
//		
//		System.out.println(weekdayTest.hasTeen(13,20,10));
//		System.out.println(weekdayTest.hasTeen(20,19,10));
//		System.out.println(weekdayTest.hasTeen(20,10,13));
//		
//		System.out.println(weekdayTest.returnInt());
//		System.out.println(weekdayTest.returnArrayList());
//		
//		System.out.println("Temp: " + weekdayTest.icyHot(120,-1));
//		System.out.println("Temp: " + weekdayTest.icyHot(-1,120));
//		System.out.println("Temp: " + weekdayTest.icyHot(2,120));
//		
//		System.out.println("Every Nth " + weekdayTest.everyNth("Miracle", 2));
//		System.out.println("Every Nth " + weekdayTest.everyNth("abcdefg", 2));
//		System.out.println("Every Nth " + weekdayTest.everyNth("abcdefg", 3));
//		
		
		System.out.println(weekdayTest.palindrome("hannah"));
		System.out.println(weekdayTest.palindrome("martin"));
		System.out.println(weekdayTest.palindrome("racecar"));
	}
	
	/**
	 * Checks if the parameter string is a palindrome
	 * by assigning it to a StringBuilder and using the
	 * reverse method
	 * @param inputString string passed into method to test
	 * @return true or false result
	 */
	public boolean palindrome(String inputString) {
		boolean result =false;
		StringBuilder stringBuilderInput = new StringBuilder(inputString);
		if(stringBuilderInput.reverse().toString().equals(inputString))
			result = true;
		return result;
	}
	
	
	/**
	 * 
	 * Depending on if its not a weekday or if it is a vacation
	 * returns a value to decide will we sleep in
	 * @param weekday bool
	 * @param vacay bool
	 * @return bool result
	 */
	public boolean sleepIn(boolean weekday,boolean vacay)
	{
		boolean result = false;
		
		if(!weekday||vacay)
			result = true;
		
		return result;
	}
	
	/**
	 * Removes a character at n from string input
	 * 
	 * @param input string text to remove character from
	 * @param n int index of character to remove
	 * @return input string without the character at n
	 */
	public String missingChar(String input, int n) {
		return input.substring(0,n)+input.substring(n+1);
	}
	
	/**
	 * Takes a string and returns a bool if it starts
	 * with hi/Hi
	 * @param input string of text to check
	 * @return boolean
	 */
	public boolean startsHi(String input) {
		boolean test = false;
		if(input.startsWith("Hi")||input.startsWith("hi"))
			test = true;
		return test;
	}
	
	/**
	 * Checks whether any one of three input integers
	 * are between 12 and 20 not inclusive.
	 * @param a int
	 * @param b int
	 * @param c int
	 * @return boolean
	 */
	public boolean hasTeen(int a, int b, int c) {
		boolean test = false;
		if(a>12&&a<20||b>12&&b<20||c>12&&c<20)
			test = true;
		return test;
	}
	
	/**
	 * returns an int
	 * @return 42
	 */
	public int returnInt() {
		int result = 42;
		return result;
	}
	
	/**
	 * multply two ints
	 * @param a first int
	 * @param b second int
	 * @return result int
	 */
	public int returnMultipleInt(int a, int b) {
		return a*b;
	}
	
	/**
	 * return arraylist of hello world
	 * @return strings hello and world
	 */
	public ArrayList<String> returnArrayList() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("hello");
		result.add("world");
		return result;
	}
	
	/**
	 * Given two temps return true if one is less than 0
	 * @return boolean result of test
	 */
	public boolean icyHot(int a, int b) {
		boolean result = false;
		if(a>100&&b<0||a<0&&b>100)
			result = true;
		return result;
	}
	
	/**
	 * counts number of "xx" in a given string
	 */
	public int countLetters(String test) {
		int count = 0;
		count = test.length();		
		return count;
	}
	
	/**
	 * return a new string using ever int N char
	 */
	public String everyNth(String inputString, int n) {
		String result="";
		
		for(int index = 0; index<inputString.length();index+=n)
		{
			result+=inputString.charAt(index);
		}
		
		return result;
	}

}
