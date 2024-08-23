package com.Evergent.CoreJava.Rakesh.Application4;

class WeddingManagement extends WeddingManagementBase implements BookingInterface, PaymentInterface, ReportInterface, CouponInterface {
    CouponType couponType = CouponType.NONE;

    @Override
    public void bookVenue(String venueType) {
        switch (venueType.toUpperCase()) {
            case "HALL":
                venueCost = 50000;
                break;
            case "GARDEN":
                venueCost = 70000;
                break;
            default:
                System.out.println("Invalid venue type.");
                return;
        }
        totalAmount = venueCost;
        System.out.println("Venue booked successfully. Cost: RM " + venueCost);
    }

    @Override
    public void arrangeCatering(String cateringType, int guestCount) {
        this.guestCount = guestCount;
        switch (cateringType.toUpperCase()) {
            case "STANDARD":
                cateringCost = 100 * guestCount;
                break;
            case "PREMIUM":
                cateringCost = 200 * guestCount;
                break;
            default:
                System.out.println("Invalid catering type.");
                return;
        }
        totalAmount += cateringCost;
        System.out.println("Catering arranged successfully. Cost: RM " + cateringCost);
    }

    @Override
    public void scheduleEntertainment(String entertainmentType) {
        switch (entertainmentType.toUpperCase()) {
            case "BAND":
                entertainmentCost = 3000;
                break;
            case "DJ":
                entertainmentCost = 2000;
                break;
            default:
                System.out.println("Invalid entertainment type.");
                return;
        }
        totalAmount += entertainmentCost;
        System.out.println("Entertainment scheduled successfully. Cost: RM " + entertainmentCost);
    }

    @Override
    void calculateDiscount() {
        // Calculate the discount based on the number of guests
        if (guestCount >= 100) {
            discountAmount = (int) (totalAmount * 0.10);
        } else {
            discountAmount = 0;
        }

        // Apply coupon discount only if no other discount was applied
        if (discountAmount == 0) {
            switch (couponType) {
                case DISCOUNT10:
                    discountAmount = (int) (totalAmount * 0.10);
                    break;
                case DISCOUNT20:
                    discountAmount = (int) (totalAmount * 0.20);
                    break;
                case NONE:
                    break;
            }
        }

        finalAmount = totalAmount - discountAmount;
    }

    @Override
    public void displayTotalAmount() {
        calculateDiscount();
        System.out.println("Total amount to be paid: RM " + finalAmount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing payment...");
        System.out.println("Payment successful! Amount paid: RM " + finalAmount);
    }

    @Override
    public void displayInvoice() {
        System.out.println("======================");
        System.out.println("Invoice");
        System.out.println("======================");
        System.out.println("Order ID: " + (int) (Math.random() * 10000));
        System.out.println("Number of guests: " + guestCount);
        System.out.println("Total amount: RM " + finalAmount);
    }

    @Override
    public void displaySummary() {
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

    @Override
    public void applyCoupon(String couponCode) {
        switch (couponCode.toUpperCase()) {
            case "DISCOUNT10":
                couponType = CouponType.DISCOUNT10;
                System.out.println("Coupon DISCOUNT10 applied. 10% off on total amount.");
                break;
            case "DISCOUNT20":
                couponType = CouponType.DISCOUNT20;
                System.out.println("Coupon DISCOUNT20 applied. 20% off on total amount.");
                break;
            default:
                couponType = CouponType.NONE;
                System.out.println("Invalid coupon code.");
        }
    }
    public static void main(String[] args) {
        WeddingManager manager = new WeddingManager();
        manager.manageWedding();
    }
}
