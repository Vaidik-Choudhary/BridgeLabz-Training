// Creating CourseDiscount class to compute course fee discount
class CourseDiscount {
    public static void main(String[] args) {

        // Creating variable and Calculations
        double fee = 125000;
        double discountPercent = 10;
        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;

        // Printing discount amount
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
}