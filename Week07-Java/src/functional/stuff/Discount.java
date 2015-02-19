package functional.stuff;

import java.util.Arrays;
import java.util.List;

public class Discount {
	
	public static void main(String[] args) {
		final List<Integer> prices = Arrays.asList(10,15,20,25);
		System.out.println("Total of discounted prices " + discountImperative(prices));
		System.out.println("Total of discounted prices " + discountFunctional(prices));
	}

	private static Double discountImperative(List<Integer> prices) {
		double totalOfDiscountedPrices = 0.0;
		for (Integer price : prices) {
			totalOfDiscountedPrices += price * 0.9;
		}
		return totalOfDiscountedPrices;
	}
	
	private static Double discountFunctional(List<Integer> prices) {
		return prices.stream().mapToDouble(price -> price * 0.9).sum();
	}

}
