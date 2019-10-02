package uk.ac.belfastmet.examples1;

public class StringExample {

	public static void main(String[] args) {
		String name = "Will Smith";
//		name = name.replace('i', 'o');
//		System.out.println(name);
//		StringExample stringExample = new StringExample();
//		stringExample.upperString();
		System.out.println(name+'a');

	}
	
	/**
	 * Print the first character of a string
	 */
	public void firstCharacter() {
		String name = "Ocelot";
		char letter = name.charAt(2);
		System.out.println(letter);
	}
	
	/**
	 * Check if the first character of a string is a specific letter
	 */
	public void startCharacter() {
		String name = "Ocelot";
		boolean startsWith = name.startsWith("O");
		if(startsWith)
			System.out.println("Ocelot starts with O");
	}
	
	
	/**
	 * Check if the last character of a string is a specific letter
	 */
	public void endCharacter() {
		String name = "Ocelot";
		boolean endsWith = name.endsWith("ot");
		if(endsWith)
			System.out.println("Ocelot ends with ot");
	}
	
	/**
	 * Split a string into a string array of individual words and print them out
	 */
	public void splitString() {
		String name = "Arianna Grande";
		String split[] = name.split("a");
		for(String i:split)
			System.out.println(i);
		System.out.println(split);
	}
	
	/**
	 * Print a string in lower case
	 */
	public void upperString() {
		String sentence = "I am invicible";
		//sentence.toUpperCase();
		System.out.println(sentence.toLowerCase());
	}
}
