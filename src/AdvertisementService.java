
public class AdvertisementService {

	public void createAdvertisement(Advertisement ad) {

		try {
			String sql = "insert into 12825612Advertisement(ID, Address) values ("+ad.getID()+","+ad.getAddress()+")";
			DatabaseConnection dbc = new DatabaseConnection();
			dbc.executeSql(sql);
			System.out.println("Student Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Advertisement ad = new Advertisement();
		ad.setID(1);
		ad.setAddress("hello");
		
		AdvertisementService as = new AdvertisementService();
		as.createAdvertisement(ad);
	}
}
