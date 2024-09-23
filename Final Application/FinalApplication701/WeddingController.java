package com.Evergent.CoreJava.Rakesh.FinalApplication701;




import java.util.List;
import java.util.Scanner;

public class WeddingController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeddingService weddingService = new WeddingService();
        StringBuilder transactions = new StringBuilder();

        int choice;
        do {
            System.out.println("------------------------WELCOME TO THE WEDDING MANAGEMENT SYSTEM---------------------");
            System.out.println("1. Create a New Wedding");
            System.out.println("2. Show Wedding Details");
            System.out.println("3. Add Guest");
            System.out.println("4. Manage Venue");
            System.out.println("5. Print Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    WeddingBean wedding = new WeddingBean();
                    System.out.print("Enter Wedding Date (YYYY-MM-DD): ");
                    wedding.setWeddingDate(scanner.nextLine());
                    System.out.print("Enter Bride Name: ");
                    wedding.setBrideName(scanner.nextLine());
                    System.out.print("Enter Groom Name: ");
                    wedding.setGroomName(scanner.nextLine());
                    System.out.print("Enter Venue (Hall/Garden): ");
                    wedding.setVenue(scanner.nextLine());
                    System.out.print("Enter Estimated Guests: ");
                    wedding.setEstimatedGuests(scanner.nextInt());
                    weddingService.createWedding(wedding);
                    transactions.append("Wedding created for ").append(wedding.getBrideName()).append(" and ").append(wedding.getGroomName()).append("\n");
                    System.out.println("Wedding created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Wedding Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    WeddingBean retrievedWedding = weddingService.getWedding(date);
                    if (retrievedWedding != null) {
                        System.out.println("Wedding Details:");
                        System.out.println("Bride: " + retrievedWedding.getBrideName());
                        System.out.println("Groom: " + retrievedWedding.getGroomName());
                        System.out.println("Venue: " + retrievedWedding.getVenue());
                        System.out.println("Estimated Guests: " + retrievedWedding.getEstimatedGuests());
                    } else {
                        System.out.println("No wedding found for the given date.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Wedding Date (YYYY-MM-DD): ");
                    String weddingDate = scanner.nextLine();
                    System.out.print("Enter Guest Name: ");
                    String guestName = scanner.nextLine();
                    weddingService.addGuest(weddingDate, guestName);
                    transactions.append("Guest ").append(guestName).append(" added\n");
                    System.out.println("Guest added successfully!");
                    break;

                case 4:
                    System.out.println("1. Book Venue");
                    System.out.println("2. Cancel Venue");
                    System.out.print("Enter your choice: ");
                    int venueChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Wedding Date (YYYY-MM-DD): ");
                    String venueDate = scanner.nextLine();
                    System.out.print("Enter Venue Type (Hall/Garden): ");
                    String venueType = scanner.nextLine();
                    if (venueChoice == 1) {
                        transactions.append("Venue booked: ").append(venueType).append("\n");
                        System.out.println("Venue booked successfully!");
                    } else {
                        transactions.append("Venue cancelled for date: ").append(venueDate).append("\n");
                        System.out.println("Venue cancelled successfully!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Wedding Date (YYYY-MM-DD): ");
                    String transDate = scanner.nextLine();
                    System.out.println("---------------YOUR TRANSACTIONS ARE---------------");
                    System.out.println(transactions.toString());
                    break;

                case 6:
                    System.out.println("Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
        scanner.close();
    }
}