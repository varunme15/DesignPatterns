package strategy;

public class PaypalPaymentType implements PaymentType {

	private String userName;
	private String password;

	public PaypalPaymentType(String userName, String password) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.password = password;

	}
	@Override
	public boolean pay(double amout) {
		// TODO Auto-generated method stub
		System.out.println("Paid with Paypal: "+amout);
		return true;
	}

}
