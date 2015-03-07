package builder;

public class FullName {
	
	private final String firstName;
	private final String lastName;
	private final String middleName;
	private final String salutation;
	
	public FullName(NameBuilder name
				){
		this.firstName = name.firstName;
		this.lastName = name.lastName;
		this.middleName = name.middleName;
		this.salutation = name.salutation;
	};
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getSalutation() {
		return salutation;
	}
	
	
	public static class NameBuilder {
		
		private final String firstName;
		
		private final String lastName;
		private String middleName;
		private String salutation;
		
		public NameBuilder( String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		};
		


		public NameBuilder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		

		public NameBuilder setSalutation(String salutation) {
			this.salutation = salutation;
			return this;
		}
		
		public FullName builder(){
			return new FullName(this);
		}
	}

}
                                                 