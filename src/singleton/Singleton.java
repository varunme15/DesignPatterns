package singleton;

public class Singleton {

	private static Singleton myInstance;
	
	private Singleton(){};

	public static Singleton getInstance(){
		if(myInstance == null){
			myInstance = new Singleton();
		}
		return myInstance;
	}
}

