package ro.ase.csie.cts.g1094.dp.singleton.staticversion;

public class RESTBackend {
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	//Executed only once
	static {
		System.out.println("Is executed when the class is loaded by the JVM");
		
		//Get the data from config files or something else	
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro/cts";
	}
	
	{
		System.out.println("Is executed before any constructor call");
	}
	
	private RESTBackend() {
		
	}
	
//	private RESTBackend() {
//		//Get the data from config files or something else	
//	}
}
