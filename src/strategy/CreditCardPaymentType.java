package strategy;

public class CreditCardPaymentType implements PaymentType {

	private String name;
	private String cardNumber;
	private int cvv;
	private String dateOfExpiry;
	public CreditCardPaymentType(String name, String cardNumber, int cvv, String dateOfExpiry) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public boolean pay(double amout) {
		// TODO Auto-generated method stub
		System.out.println("Paid with Debit/Credit Card: "+amout);
		return true;
	}

}
