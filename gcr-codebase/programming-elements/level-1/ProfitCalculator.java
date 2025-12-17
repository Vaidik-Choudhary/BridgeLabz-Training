// Creating ProfitCalculator class to compute profit and profit percentage
class ProfitCalculator {
    public static void main(String[] args) {

        // Creating variables and Calculations
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        // Printing Cost Price and Selling Price, Profit and Profit Percentage
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}