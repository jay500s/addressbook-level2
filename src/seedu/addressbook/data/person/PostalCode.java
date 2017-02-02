package seedu.addressbook.data.person;

public class PostalCode {

	private String postalCodeString;
	
	public PostalCode (String postalCodeString){
		this.postalCodeString = postalCodeString;
	}
	
	public String toString(){
		return postalCodeString;
	}	
	
}
