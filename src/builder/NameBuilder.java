/**
 * 
 *//*
package builder;

import java.util.jar.Attributes.Name;

*//**
 * @author varun
 *
 *//*
public class NameBuilder {
	
	private final String firstName;
	
	private final String lastName;
	private String middleName;
	private String salutation;
	
	public NameBuilder( String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	};
	

	public NameBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	

	public NameBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	

	public NameBuilder setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	

	public NameBuilder setSalutation(String salutation) {
		this.salutation = salutation;
		return this;
	}
	
	
	
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


	public FullName createFullName(){
		return new FullName(this);
	}


	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

}
*/