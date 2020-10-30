
public class PayDesk {

	public static void processPayment(Card discountCard, double purchaseValue) {
		printReceipt(purchaseValue, discountCard.getDiscountRate(), discountCard.getDiscount(purchaseValue),
				(purchaseValue - discountCard.getDiscount(purchaseValue)));
		discountCard.increaseTurnover(purchaseValue);
	}

	private static void printReceipt(double purchaseValue, double discountRate, double discount, double total) {
		System.out.println("\u2022 Purchase value: " + "$" + String.format("%.2f", purchaseValue));
		System.out.println("\u2022 Discount rate: " + discountRate + "%");
		System.out.println("\u2022 Discount: " + "$" + String.format("%.2f", discount));
		System.out.println("\u2022 Total: " + "$" + String.format("%.2f", total));
		System.out.println("---------------");
	}

}
