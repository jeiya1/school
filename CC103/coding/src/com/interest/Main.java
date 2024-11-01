package com.interest;

import java.util.Scanner;

public class Main {
	public enum Colors {
		RESET("\033[0m"),
		BLACK("\033[30m"),
		RED("\033[31m"),
		GREEN("\033[32m"),
		YELLOW("\033[33m"),
		BLUE("\033[34m"),
		MAGENTA("\033[35m"),
		CYAN("\033[36m"),
		GRAY("\033[37m"),
		WHITE("\033[97m"),
		BOLD("\033[1m"),
		ITALIC("\033[3m"),
		UNDERLINE("\033[4m"),
		INVERT("\033[7m");

		private final String asciiCode;

		Colors (String asciiCode) {
			this.asciiCode = asciiCode;
		}
	}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		char exit = 'n';

		while (exit == 'n') {
			DisplayMenu("", input);
		    try {
				int interestType = input.nextInt();
				switch (interestType) {
					case 1:
						Simple(input);
						break;
					case 2:
						Compound(input);
						break;
					case 0:
						System.out.printf("%sExiting program...%s\n", Colors.BOLD.asciiCode, Colors.RESET.asciiCode);
						exit = 'y';
						break;
					default:
						System.out.printf("%s%sNot a valid input. TRY AGAIN.%s\n", Colors.RED.asciiCode, Colors.BOLD.asciiCode, Colors.RESET.asciiCode);
						break;
				}
		    } catch (Exception e) {
				System.out.printf("%s%sNot a valid input. TRY AGAIN.%s\n", Colors.RED.asciiCode, Colors.BOLD.asciiCode, Colors.RESET.asciiCode);
				input.nextLine();
		    }
		}

		input.close();
    }

	private static int DisplayMenu(String choice, Scanner input) {
		int calculation = 0;
		switch (choice) {
			case "simple":
				System.out.println("\nPick a calculation:");
  	    		System.out.printf("[%s1%s] Interest = Prt\n", Colors.GREEN.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.printf("[%s2%s] Maturity Value = P + I\n", Colors.GREEN.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.printf("[%s3%s] Maturity Value = P + (Prt)\n", Colors.GREEN.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.printf("[%s4%s] Maturity Value = P(1 + rt)\n", Colors.GREEN.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.print("~> ");
				calculation = input.nextInt();
		
			default:
  	    		System.out.println("Pick the interest type:");
  	    		System.out.printf("[%s1%s] Simple Interest\n", Colors.GREEN.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.printf("[%s2%s] Compound Interest\n", Colors.GREEN.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.printf("[%s0%s] Exit Program\n", Colors.RED.asciiCode, Colors.RESET.asciiCode);
  	    		System.out.print("~> ");
				break;
		}
		return calculation;
	}

	private static void Simple(Scanner input) {
		System.out.println("Input your values (if unknown, leave 0):");
		System.out.print("Principle Amount (Php) = ");
		float princeAmt = input.nextInt();
		System.out.print("Rate (Decimal) = ");
		float rate = input.nextFloat();
		System.out.print("Time (Years)= ");
		float time = input.nextFloat();
		System.out.print("Interest (2 Decimal Places) = ");
		float interest = input.nextFloat();
		System.out.print("Maturity Value (2 Decimal Places) = ");
		float maturV = input.nextFloat();

		int calc = DisplayMenu("simple", input);

		switch (calc) {
			case 1:
				float interested = princeAmt * rate * time;
				System.out.printf("\nYour interest is: %s%s%.2f%s\n\n", Colors.MAGENTA.asciiCode, Colors.BOLD.asciiCode, interested, Colors.RESET.asciiCode);
				break;
			case 2:
				float maturvalue1 = princeAmt + interest;
				System.out.println(maturvalue1);
				break;
			case 3:
				float maturvalue2 = princeAmt + (princeAmt * rate * time);
				System.out.println(maturvalue2);
				break;
			case 4:
				float maturvalue3 = princeAmt * (1 + rate * time);
				System.out.println(maturvalue3);
				break;
			default:
				break;
		}

		// System.out.printf("principle amount:%s, rate:%s, time:%s, interest:%s, maturV:%s\n", prinAm, rate, time, interest, maturV);
		// double interested = prinAm * rate * time;
		// System.out.println("interested");
		// System.out.println(interested);
		// double timed = interest / (prinAm * rate);
		// System.out.println("timed");
		// System.out.println(timed);
		// double rated = interest / (prinAm * time);
		// System.out.println("rated");
		// System.out.println(rated);
		// double printicple = interest / (rate * time);
		// System.out.println("printicple");
		// System.out.println(printicple);
		// double maturvalue1 = prinAm + interested;
		// System.out.println("maturvalue1");
		// System.out.println(maturvalue1);
		// double maturvalue2 = prinAm + (prinAm * rate * time);
		// System.out.println("maturvalue2");
		// System.out.println(maturvalue2);
		// double maturvalue3 = prinAm * (1 + rate * time);
		// System.out.println("maturvalue3");
		// System.out.println(maturvalue3);
	}

	private static void Compound(Scanner input) {

	}
}
