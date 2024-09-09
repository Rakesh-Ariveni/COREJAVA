package com.Evergent.CoreJava.Rakesh.CaseStudy2;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SupportTicketSystem {
    // Initialize the ticketQueue directly
    private Queue<String> ticketQueue = new ArrayDeque<>();
    private Scanner scanner = new Scanner(System.in);

    // Main method to run the simulation
    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        system.run();
    }

    // Method to run the menu-driven system
    public void run() {
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1 - Add a ticket");
            System.out.println("2 - Process the next ticket");
            System.out.println("3 - Peek at the next ticket");
            System.out.println("4 - Display all tickets");
            System.out.println("5 - Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String ticket = scanner.nextLine();
                    addTicket(ticket);
                    break;
                case 2:
                    processNextTicket();
                    break;
                case 3:
                    peekNextTicket();
                    break;
                case 4:
                    displayQueue();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
    }

    // Method to process the next ticket in the queue
    public void processNextTicket() {
        String ticket = ticketQueue.poll();
        if (ticket != null) {
            System.out.println("Processed: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Method to check the next ticket without removing it
    public void peekNextTicket() {
        String ticket = ticketQueue.peek();
        if (ticket != null) {
            System.out.println("Next ticket: " + ticket);
        } else {
            System.out.println("No tickets in the queue.");
        }
    }

    // Method to display all tickets in the queue
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Current tickets in the queue:");
            for (String ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }
}
