public class CalculateProfit{
	public static void main(String[]args){
		
		int costPrice = 129;
		int sellingPrice = 191;
		
		/*
			Profit = selling price - cost price
			Profit Percentage = profit / cost price * 100
		*/
		
		int profit = sellingPrice - costPrice;
		double profitPercentage = (double)profit / (double)costPrice * 100.0;
		
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}

