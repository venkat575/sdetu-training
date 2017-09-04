package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		// Take a payment amount from a user
		double pymnt = 0;
		boolean positivePayment = true;
		
		do {
			// 1. Ask the user for input
			System.out.print("Enter payment amount: ");
			
			// 2. Get the amount + Test the value of the payment
			Scanner in = new Scanner(System.in);
			try {
				pymnt = in.nextDouble();
				if (pymnt < 0) {
					throw new NegativePaymentException(pymnt);
				}
				else {
					positivePayment=true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				positivePayment = false;
				System.out.println("Please try again...");
			}
		} while(!positivePayment);
		
		// 4. Print confirmation
		System.out.println("Thanks for your payment of $" + pymnt);
		
	}

}
