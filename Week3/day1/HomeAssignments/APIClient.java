package Week3.day1.HomeAssignments;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("EndPoint from method1: " + endpoint );

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("EndPoint from Method2: " + endpoint);
		System.out.println("Request body:"  + requestBody);
		System.out.println("Request status:"  + requestStatus);

	}

	public static void main(String[] args) {
		
		APIClient obj = new APIClient();
		obj.sendRequest("/api/v1/products");
		obj.sendRequest("/api/v1/products", "Ben", true);

	}


}
