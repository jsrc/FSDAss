import java.util.List;

public class Advertisement {
	public Advertisement() {
	}
	private int ID;
	
	private String address;
	
	private String price;
	
	private String propertyType;
	
	private String bedrooms;
	
	private String bathrooms;
	
	private String parkingSpaces;
	
	private String description;
	
	private String contractName;
	
	private String phoneNumber;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPrice(String value) {
		this.price = value;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPropertyType(String value) {
		this.propertyType = value;
	}
	
	public String getPropertyType() {
		return propertyType;
	}
	
	public void setBedrooms(String value) {
		this.bedrooms = value;
	}
	
	public String getBedrooms() {
		return bedrooms;
	}
	
	public void setBathrooms(String value) {
		this.bathrooms = value;
	}
	
	public String getBathrooms() {
		return bathrooms;
	}
	
	public void setParkingSpaces(String value) {
		this.parkingSpaces = value;
	}
	
	public String getParkingSpaces() {
		return parkingSpaces;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setContractName(String value) {
		this.contractName = value;
	}
	
	public String getContractName() {
		return contractName;
	}
	
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public Advertisement search() {
		AdvertisementService ads = new AdvertisementService();
		List<Advertisement> list = ads.listAdvertisement();
		if (list.size() != 0) {
			return list.get(0);
		}
		return new Advertisement();
	}
	
	public List<Advertisement> listAllAdvertisement() {
		AdvertisementService ads = new AdvertisementService();
		return ads.listAdvertisement();
	}
	
	public void addAdvertisement() {
		AdvertisementService ads = new AdvertisementService();
		ads.createAdvertisement(this);
	}
	
	public void deleteAdvertisement() {
		AdvertisementService ads = new AdvertisementService();
		ads.deleteAdvertisement(getID());
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
