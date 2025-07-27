package Week3.day1;

public class Overriding extends LearnPoly{
	public void takesnap() {
		System.out.println("Snapshot ");	
	}
	
	public void reportStep(String msg, String status) {
		super.reportStep("Success ", "Pass");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding orp = new Overriding();
		orp.takesnap();
		orp.reportStep("Pass ", "Completed");
		orp.reportStep("Fail ","status ", false);
	}

}
