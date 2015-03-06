package strategy;

import java.util.Scanner;

public class StrategyTest {

	public static void main(String[] args) {
		
		ShoppingCart sc = new ShoppingCart();
		
		sc.addItem(new Item("as34",90.04));
		sc.addItem(new Item("vd34",170.34));
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Select Payment Type, 1: Credit Card, 2: Paypal");
		int payType = keyboard.nextInt();
		if(payType == 1){
		sc.pay(new CreditCardPaymentType("Va", "1234", 123, "May2014"));// making decisions at runtime
		}else if(payType == 2){
		sc.pay(new PaypalPaymentType("Va", "1234"));
		}else{
			System.out.println("Incorrect Option");
		}
	}

}
