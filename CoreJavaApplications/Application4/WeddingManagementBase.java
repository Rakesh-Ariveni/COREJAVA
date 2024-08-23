package com.Evergent.CoreJava.Rakesh.Application4;

public abstract class WeddingManagementBase {
    int venueCost;
    int cateringCost;
    int entertainmentCost;
    int guestCount;
    int totalAmount;
    int discountAmount;
    int finalAmount;

    abstract void calculateDiscount();

    public void showManagementDetails() {
        System.out.println("This is the Wedding Management System.");
    }
}
