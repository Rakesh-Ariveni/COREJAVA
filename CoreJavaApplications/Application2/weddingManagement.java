package com.Evergent.CoreJava.Rakesh.Application2;

import java.util.Scanner;

public class weddingManagement {

	enum MainModule {
		B, P, R, Q
	}

	enum BookingSubmodule {
		V, C, E, M
	}

	enum PaymentSubmodule {
		T, P, M
	}

	enum ReportSubmodule {
		I, S, M
	}

	enum VenueType {
		HALL, GARDEN
	}

	enum CateringType {
		STANDARD, PREMIUM
	}

	enum EntertainmentType {
		BAND, DJ
	}

	static int venueCost;
	static int cateringCost;
	static int entertainmentCost;
	static int guestCount;
	static int totalAmount;
	static int discountAmount;
	static int finalAmount;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\t\tWelcome To WEDDING MANAGEMENT");

		while (true) {
			System.out.println("======================");
			System.out.println("WM Main Menu");
			System.out.println("======================");
			System.out.println("B - Booking");
			System.out.println("P - Payment");
			System.out.println("R - Records");
			System.out.println("E - Exit");
			System.out.println("======================");
			System.out.print("Enter your choice (B, P, R, Q): ");

			String moduleInput = scanner.nextLine().toUpperCase();

			try {
				MainModule mainModule = MainModule.valueOf(moduleInput);

				switch (mainModule) {
				case B:
					handleBookingModule(scanner);
					break;
				case P:
					handlePaymentModule(scanner);
					break;
				case R:
					handleReportModule(scanner);
					break;
				case Q:
					System.out.println("Exiting the system...");
					System.exit(0);
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input, please try again.");
			}
		}
	}

	private static void handleBookingModule(Scanner scanner) {
		System.out.println("======================");
		System.out.println("Booking Module");
		System.out.println("======================");
		System.out.println("V - Book Venue");
		System.out.println("C - Arrange Catering");
		System.out.println("E - Schedule Entertainment");
		System.out.println("M - Return to Main Menu");
		System.out.println("======================");
		System.out.print("Enter your choice (V, C, E, M): ");

		String submoduleInput = scanner.nextLine().toUpperCase();

		try {
			BookingSubmodule bookingSubmodule = BookingSubmodule.valueOf(submoduleInput);

			switch (bookingSubmodule) {
			case V:
				handleVenueBooking(scanner);
				break;
			case C:
				handleCateringBooking(scanner);
				break;
			case E:
				handleEntertainmentBooking(scanner);
				break;
			case M:
				// Return to Main Menu
				break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, please try again.");
		}
	}

	private static void handleVenueBooking(Scanner scanner) {
		System.out.println("======================");
		System.out.println("Venue Booking");
		System.out.println("======================");
		System.out.println("HALL - Indoor Hall (RM 50000)");
		System.out.println("GARDEN - Outdoor Garden (RM 70000)");
		System.out.println("======================");
		System.out.print("Enter your choice (HALL, GARDEN): ");

		String venueInput = scanner.nextLine().toUpperCase();

		try {
			VenueType venueType = VenueType.valueOf(venueInput);

			switch (venueType) {
			case HALL:
				venueCost = 50000;
				break;
			case GARDEN:
				venueCost = 70000;
				break;
			}

			System.out.print("Enter the number of guests: ");
			guestCount = Integer.parseInt(scanner.nextLine());
			totalAmount = venueCost;

			System.out.println("Venue booked successfully. Cost: RM " + venueCost);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, please try again.");
		}
	}

	private static void handleCateringBooking(Scanner scanner) {
		System.out.println("======================");
		System.out.println("Catering Booking");
		System.out.println("======================");
		System.out.println("STANDARD - Standard Menu (RM 100 per guest)");
		System.out.println("PREMIUM - Premium Menu (RM 200 per guest)");
		System.out.println("======================");
		System.out.print("Enter your choice (STANDARD, PREMIUM): ");

		String cateringInput = scanner.nextLine().toUpperCase();

		try {
			CateringType cateringType = CateringType.valueOf(cateringInput);

			switch (cateringType) {
			case STANDARD:
				cateringCost = 100 * guestCount;
				break;
			case PREMIUM:
				cateringCost = 200 * guestCount;
				break;
			}

			totalAmount += cateringCost;

			System.out.println("Catering arranged successfully. Cost: RM " + cateringCost);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, please try again.");
		}
	}

	private static void handleEntertainmentBooking(Scanner scanner) {
		System.out.println("======================");
		System.out.println("Entertainment Booking");
		System.out.println("======================");
		System.out.println("BAND - Live Band (RM 3000)");
		System.out.println("DJ - DJ Performance (RM 2000)");
		System.out.println("======================");
		System.out.print("Enter your choice (BAND, DJ): ");

		String entertainmentInput = scanner.nextLine().toUpperCase();

		try {
			EntertainmentType entertainmentType = EntertainmentType.valueOf(entertainmentInput);

			switch (entertainmentType) {
			case BAND:
				entertainmentCost = 3000;
				break;
			case DJ:
				entertainmentCost = 2000;
				break;
			}

			totalAmount += entertainmentCost;

			System.out.println("Entertainment scheduled successfully. Cost: RM " + entertainmentCost);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, please try again.");
		}
	}

	private static void handlePaymentModule(Scanner scanner) {
		System.out.println("======================");
		System.out.println("Payment Module");
		System.out.println("======================");
		System.out.println("T - Display Total Amount");
		System.out.println("P - Make Payment");
		System.out.println("M - Return to Main Menu");
		System.out.println("======================");
		System.out.print("Enter your choice (T, P, M): ");

		String submoduleInput = scanner.nextLine().toUpperCase();

		try {
			PaymentSubmodule paymentSubmodule = PaymentSubmodule.valueOf(submoduleInput);

			switch (paymentSubmodule) {
			case T:
				calculateDiscount();
				System.out.println("Total amount to be paid: RM " + finalAmount);
				break;
			case P:
				System.out.println("Processing payment...");
				System.out.println("Payment successful! Amount paid: RM " + finalAmount);
				break;
			case M:
				// Return to Main Menu
				break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, please try again.");
		}
	}

	private static void calculateDiscount() {
		if (guestCount >= 100) {
			discountAmount = (int) (totalAmount * 0.10);
		} else {
			discountAmount = 0;
		}
		finalAmount = totalAmount - discountAmount;
	}

	private static void handleReportModule(Scanner scanner) {
		System.out.println("======================");
		System.out.println("Report Module");
		System.out.println("======================");
		System.out.println("I - Display Invoice");
		System.out.println("S - Display Summary");
		System.out.println("M - Return to Main Menu");
		System.out.println("======================");
		System.out.print("Enter your choice (I, S, M): ");

		String submoduleInput = scanner.nextLine().toUpperCase();

		try {
			ReportSubmodule reportSubmodule = ReportSubmodule.valueOf(submoduleInput);

			switch (reportSubmodule) {
			case I:
				displayInvoice();
				break;
			case S:
				displaySummary();
				break;
			case M:
				// Return to Main Menu
				break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input, please try again.");
		}
	}

	private static void displayInvoice() {
		System.out.println("======================");
		System.out.println("Invoice");
		System.out.println("======================");
		System.out.println("Order ID: " + (int) (Math.random() * 10000));
		System.out.println("Number of guests: " + guestCount);
		System.out.println("Total amount: RM " + finalAmount);
	}

	private static void displaySummary() {
		System.out.println("======================");
		System.out.println("Order Summary");
		System.out.println("======================");
		System.out.println("Venue cost: RM " + venueCost);
		System.out.println("Catering cost: RM " + cateringCost);
		System.out.println("Entertainment cost: RM " + entertainmentCost);
		System.out.println("Total amount before discount: RM " + totalAmount);
		System.out.println("Discount: RM " + discountAmount);
		System.out.println("Final amount to be paid: RM " + finalAmount);
	}
}
