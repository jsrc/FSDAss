
public class Address {
	public Address() {
	}
	

	private int ID;
	
	private String state;
	
	private String suburb;
	
	private String street;
	
	private String postcode;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return state;
	}
	
	public void setSuburb(String value) {
		this.suburb = value;
	}
	
	public String getSuburb() {
		return suburb;
	}
	
	public void setStreet(String value) {
		this.street = value;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setPostcode(String value) {
		this.postcode = value;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
