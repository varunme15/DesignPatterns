package builder;

public class NameBuilderTest {
	
	public static void main(String[] args){
		
		FullName f1 = new FullName.NameBuilder("Varun", "Dixit").setMiddleName("MD").setSalutation("Mr. ").builder();
		System.out.println(f1.getMiddleName());
	}

}
