package test;

public class ShoppingCart {

	private PaymentStrategy paymentStrategy = null;
	
	public ShoppingCart(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy = paymentStrategy;
	}
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout(int amount)
	{
		paymentStrategy.pay(amount);
	}
}
