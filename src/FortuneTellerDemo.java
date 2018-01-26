import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTellerDemo {
//alt + up arrow
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US); //Currency

		double bankBalance = 150.00;
		System.out.println("Bank Balance: " + money.format(bankBalance));

		System.out.println("Enter your age");
		String age = input.nextLine();

		String retirement = null; // null versus "" == same
		try {
			// try catch - if user tries anything other then what is needed, we can prevent
			// that with Try Catch
			if (age.equals("Quit")) {
				System.out.println("No-one likes a quitter.");
				System.exit(0);
			}
			if (Integer.parseInt(age) % 2 == 0) {
				retirement = "12";
			} else if (Integer.parseInt(age) % 2 == 1) {
				retirement = "14";
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input!");
			System.exit(0);
		}
		System.out.println("You will retire in " + retirement + " years.");

		input.close();
	}

}
