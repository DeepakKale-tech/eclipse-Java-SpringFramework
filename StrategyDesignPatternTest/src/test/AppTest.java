package test;

public class AppTest {

	public static void main(String[] args) {
		
		//constructor injection
		ShoppingCart cart = new ShoppingCart(new PayPalPayment());
		
		
		//setter method injection
		cart.setPaymentStrategy(new PayPalPayment());
		cart.checkout(100);
		

	}

}
