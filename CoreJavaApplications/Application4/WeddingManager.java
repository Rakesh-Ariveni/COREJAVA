package com.Evergent.CoreJava.Rakesh.Application4;

import java.util.Scanner;

public class WeddingManager {
    private WeddingManagement weddingManagement;

    public WeddingManager() {
        this.weddingManagement = new WeddingManagement();
    }

    public void manageWedding() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\tWelcome To WEDDING MANAGEMENT");

        while (true) {
            System.out.println("======================");
            System.out.println("WM Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking");
            System.out.println("P - Payment");
            System.out.println("R - Records");
            System.out.println("Q - Quit");
            System.out.println("======================");
            System.out.print("Enter your choice (B, P, R, Q): ");

            String moduleInput = scanner.nextLine().toUpperCase();

            switch (moduleInput) {
                case "B":
                    handleBookingModule(scanner);
                    break;
                case "P":
                    handlePaymentModule(scanner);
                    break;
                case "R":
                    handleReportModule(scanner);
                    break;
                case "Q":
                    System.out.println("Exiting the system...");
                    return;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }

    private void handleBookingModule(Scanner scanner) {
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

        switch (submoduleInput) {
            case "V":
                handleVenueBooking(scanner);
                break;
            case "C":
                handleCateringBooking(scanner);
                break;
            case "E":
                handleEntertainmentBooking(scanner);
                break;
            case "M":
                // Return to Main Menu
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }
    }

    private void handleVenueBooking(Scanner scanner) {
        System.out.println("======================");
        System.out.println("Venue Booking");
        System.out.println("======================");
        System.out.println("HALL - Indoor Hall (RM 50000)");
        System.out.println("GARDEN - Outdoor Garden (RM 70000)");
        System.out.println("======================");
        System.out.print("Enter your choice (HALL, GARDEN): ");

        String venueInput = scanner.nextLine().toUpperCase();

        weddingManagement.bookVenue(venueInput);
    }

    private void handleCateringBooking(Scanner scanner) {
        System.out.println("======================");
        System.out.println("Catering Booking");
        System.out.println("======================");
        System.out.println("STANDARD - Standard Menu (RM 100 per guest)");
        System.out.println("PREMIUM - Premium Menu (RM 200 per guest)");
        System.out.println("======================");
        System.out.print("Enter your choice (STANDARD, PREMIUM): ");

        String cateringInput = scanner.nextLine().toUpperCase();

        System.out.print("Enter the number of guests: ");
        int guestCount = Integer.parseInt(scanner.nextLine());

        weddingManagement.arrangeCatering(cateringInput, guestCount);
    }

    private void handleEntertainmentBooking(Scanner scanner) {
        System.out.println("======================");
        System.out.println("Entertainment Booking");
        System.out.println("======================");
        System.out.println("BAND - Live Band (RM 3000)");
        System.out.println("DJ - DJ Performance (RM 2000)");
        System.out.println("======================");
        System.out.print("Enter your choice (BAND, DJ): ");

        String entertainmentInput = scanner.nextLine().toUpperCase();

        weddingManagement.scheduleEntertainment(entertainmentInput);
    }

    private void handlePaymentModule(Scanner scanner) {
        System.out.println("======================");
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - Display Total Amount");
        System.out.println("P - Make Payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your choice (T, P, M): ");

        String submoduleInput = scanner.nextLine().toUpperCase();

        switch (submoduleInput) {
            case "T":
                weddingManagement.displayTotalAmount();
                break;
            case "P":
                System.out.print("Enter coupon code (if any): ");
                String couponCode = scanner.nextLine().toUpperCase();
                weddingManagement.applyCoupon(couponCode);
                weddingManagement.makePayment();
                break;
            case "M":
                // Return to Main Menu
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }
    }

    private void handleReportModule(Scanner scanner) {
        System.out.println("======================");
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I - Display Invoice");
        System.out.println("S - Display Summary");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your choice (I, S, M): ");

        String submoduleInput = scanner.nextLine().toUpperCase();

        switch (submoduleInput) {
            case "I":
                weddingManagement.displayInvoice();
                break;
            case "S":
                weddingManagement.displaySummary();
                break;
            case "M":
                // Return to Main Menu
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }
    }
}