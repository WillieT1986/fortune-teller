import java.util.Scanner;

//Develop a console application that will tell the user’s fortune based on data received from the user.
public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Recommend to Memorize

		System.out.println("Enter First Name: ");
		String firstName = input.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = input.nextLine();

		// Should we greet user firstName lastName?

		System.out.println("Enter your age: ");
		String age = input.nextLine(); //int

		System.out.println("What is your Birth Month? ");
		String birthMonth = input.nextLine(); //int

		// int january = 1;
		// int february = 2;
		// int march = 3;
		// int april = 4;
		// int may = 5;
		// int june = 6;
		// int july = 7;
		// int august = 8;
		// int september = 9;
		// int october = 10;
		// int november = 11;
		// int december = 12;

		System.out.println("What is your favorite ROYGBIV color? ");
		System.out.println("If unsure please type in Help.");
		String roygbiv = input.nextLine();

		System.out.println("How many Siblings?");
		String sibling = input.nextLine(); //int
		// Should I do a simple number and output the answer or should I ask yes or no
		// and then ask for a number of siblings?

		// Display the user’s fortune in this format:

		// System.out.println(firstName + lastName + " will retire in " + [birthMonth] +
		// " number of years with " + [bankBalance] + " in the bank, a vacation home in
		// " + [location] + ", and travel by " + [modeOfTrans] + ".");

		input.close();
	}

}
