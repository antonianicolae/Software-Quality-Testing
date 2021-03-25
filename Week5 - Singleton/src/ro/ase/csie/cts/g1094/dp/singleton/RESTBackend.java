package ro.ase.csie.cts.g1094.dp.singleton;

public class RESTBackend {
	String url;
	String data;
	
	//Eager-instantiation
	//private static RESTBackend theBackend =new RESTBackend();
	
	private static RESTBackend theBackend = null;
	
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	public void sendGET() {
		System.out.println("Send GET command to " + this.url);
	}
	
	//Lazy-instantiation example
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend == null) {
			//Get the backend data from config/settings file
			String url = "acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url, data);
		}
		
		return theBackend;
	}
	
	public static synchronized RESTBackend getRESTBackend(String url, String data) {
		if(theBackend == null) {
			//Get the backend data from config/settings file
			theBackend = new RESTBackend(url, data);
		}
		
		return theBackend;
	}
	
}
