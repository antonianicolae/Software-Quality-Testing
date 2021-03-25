package ro.ase.csie.cts.g1094.dp.singleton;

public class RESTBackend {
	String url;
	String data;
	
	private static RESTBackend theBackend = null;
	
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	public void sendGET() {
		System.out.println("Send GET command to " + this.url);
	}
	
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend == null) {
			//Get the backend data from config/settings file
			String url = "acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url, data);
		}
		
		return theBackend;
	}
	
}
