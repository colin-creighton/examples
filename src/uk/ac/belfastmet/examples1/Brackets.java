package uk.ac.belfastmet.examples1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brackets {

	/**
	 * a method to tell if an input string has the correct brackets in the right order
	 * 
	 * @param input string of brackets to be tested
	 * @return a string message denoting whether the input was balanced
	 */
	public static String balancedBrackets(String input) {
		String result = "Balanced";
		if(input.length()%2!=0)
			result = "Not Balanced";
		if(input.contains("{]")||input.contains("(]")||input.contains("{)")||input.contains("[)")||input.contains("[}")||input.contains("(}"))
			result = "Not Balanced";
		else if(input.indexOf("[")>-1&&input.indexOf("]")<0||input.indexOf("{")>-1&&input.indexOf("}")<0||input.indexOf("(")>-1&&input.indexOf(")")<0) {
			result = "Not Balanced";
		}
		else if(input.indexOf("]")>-1&&input.indexOf("[")<0||input.indexOf("}")>-1&&input.indexOf("{")<0||input.indexOf(")")>-1&&input.indexOf("(")<0) {
			result = "Not Balanced";
		}
		
		Pattern pattern = Pattern.compile("\\(");
		Pattern closePtrn = Pattern.compile("\\)");
		Matcher matcher = pattern.matcher(input);
		Matcher matcherClose = closePtrn.matcher(input);
		int count = 0;
		int countClose = 0;
		while (matcher.find()) {
		    count++;
		}
		while (matcherClose.find()) {
			countClose++;
		}
		if(count!=countClose)
			result = "Not Balanced";
		
		Pattern pattern1 = Pattern.compile("\\{");
		Pattern closePtrn1 = Pattern.compile("\\}");
		Matcher matcher1 = pattern1.matcher(input);
		Matcher matcherClose1 = closePtrn1.matcher(input);
		int count1 = 0;
		int countClose1 = 0;
		while (matcher1.find()) {
		    count1++;
		}
		while (matcherClose1.find()) {
			countClose1++;
		}
		if(count1!=countClose1)
			result = "Not Balanced";
		
		Pattern pattern2 = Pattern.compile("\\[");
		Pattern closePtrn2 = Pattern.compile("\\]");
		Matcher matcher2 = pattern2.matcher(input);
		Matcher matcherClose2 = closePtrn2.matcher(input);
		int count2 = 0;
		int countClose2 = 0;
		while (matcher2.find()) {
		    count2++;
		}
		while (matcherClose2.find()) {
			countClose2++;
		}
		if(count2!=countClose2)
			result = "Not Balanced";
		
		return result;
	}
	
	public static void main(String[] args) {


	}

}
