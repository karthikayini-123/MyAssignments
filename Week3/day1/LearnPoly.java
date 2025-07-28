package Week3.day1;

public class LearnPoly {
	
	public void reportStep(String msg, String status) {
		System.out.println(msg + status);
		
	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println(msg + status + snap);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnPoly static1 = new  LearnPoly();
		static1.reportStep("success ","pass");
		static1.reportStep("Failed ", "fail ", false);
		
	}

}
