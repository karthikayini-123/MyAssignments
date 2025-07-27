package Week3.day2;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		Amazon amazonoptions = new Amazon();
		amazonoptions.cardPayments();
		amazonoptions.cashOnDelivery();
		amazonoptions.internetBanking();
		amazonoptions.upiPayments();

	}

	public void cashOnDelivery() {
		System.out.println("Payment: Cash on Delivery");
		
	}

	public void upiPayments() {
		System.out.println("Payment: Upi Payment");
		
	}

	public void cardPayments() {
		System.out.println("Payment: Card Payment");
		
	}

	public void internetBanking() {
		System.out.println("Payment: Net Banking");
		
	}

	public void recordPaymentDetails() {
		System.out.println("Payment details Records");
		
	}

}
