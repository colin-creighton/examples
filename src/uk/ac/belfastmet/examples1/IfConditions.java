package uk.ac.belfastmet.examples1;

public class IfConditions {

	private int a = 4;
	private int b = 5;

	public static void main(String[] args) {
		IfConditions ifConditions = new IfConditions();
		ifConditions.switchDayConditions();

	}

	/**
	 * Demonstrate if conditions
	 */
	public void printConditions() {
		if (!(a == b)) {
			System.out.println("A equals B");
		} else {
			System.out.println("A does not equal B");
		}

		if (a > b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("A is less than B");
		}

		if (a < b) {
			System.out.println("A is less than B");
		} else {
			System.out.println("A is greater than B");
		}

		if (a > b || a < b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("A equals B");
		}

		if (3 < a && a < 6) {
			System.out.println("3 is less than A and A is less than 6");
		} else {
			System.out.println("3 is greater than A or A is greater than 6");
		}
	}

	/**
	 * Demonstrate a for loop
	 */
	public void forConditions() {
		for (int index = 10; index > -1; index--) {
			System.out.println("Index is " + index);
		}
	}

	/**
	 * Demonstrate a while loop
	 */
	public void whileConditions() {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}

	/**
	 * Demonstrate that Do happens before the while check
	 */
	public void dowhileConditions() {
		int index = 0;
		do {
			System.out.println("Index: " + index);
			index++;
		} while (index < 5);
	}

	/**
	 * Print a given day of the week expressed as a number in spanish
	 */
	public void switchConditions() {
		int dia = 8;
		switch(dia) {
		case 0:
			System.out.println("Lunes");
			break;
		case 1:
			System.out.println("Martes");
			break;
		case 2:
			System.out.println("Miercoles");
			break;
		case 3:
			System.out.println("Jueves");
			break;
		case 4:
			System.out.println("Viernes");
			break;
		case 5:
			System.out.println("Sabado");
			break;
		case 6:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("No puedo entiendes, pendejo");
		}
	}
	
	/**
	 * Print a given English day in spanish
	 */
	public void switchDayConditions() {
		String dia = "tuesday";
		switch(dia) {
		case "Monday":
			System.out.println("Lunes");
			break;
		case "Tuesday":
			System.out.println("Tuesday is Martes en espanol");
			break;
		case "Wednesday":
			System.out.println("Miercoles");
			break;
		case "Thursday":
			System.out.println("Jueves");
			break;
		case "Friday":
			System.out.println("Viernes");
			break;
		case "Saturday":
			System.out.println("Sabado");
			break;
		case "Sunday":
			System.out.println("Domingo");
			break;
		default:
			System.out.println("No puedo entiendes, pendejo");
		}
	}
}
