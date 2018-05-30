import java.util.ArrayList;
import java.util.List;

public class AdvertisementService {

	public void createAdvertisement(Advertisement ad) {

		try {
			DatabaseConnection dbc = new DatabaseConnection();
			//TODO compelate the cover
			String sql = "insert into 12825612Advertisement(ID, Address) values ('"
					+ dbc.getKeys("12825612Advertisement") + "','" + ad.getAddress() + "')";
			System.out.println(sql);
			if (dbc.executeSql(sql)) {
				System.out.println("Created");
			}
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateAdvertisement(Advertisement ad) {

		try {
			DatabaseConnection dbc = new DatabaseConnection();
			//TODO compelate the cover
			String sql = "update 12825612Advertisement set (Address) values ('"+ ad.getAddress() + "') where id = "+ad.getID();
			System.out.println(sql);
			if (dbc.executeSql(sql)) {
				System.out.println("Updated");
			};
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAdvertisement(int id) {

		try {
			DatabaseConnection dbc = new DatabaseConnection();
			//TODO compelate the cover
			String sql = "delete from 12825612Advertisement where id = " + id;
			System.out.println(sql);
			if (dbc.executeSql(sql)) {
				System.out.println("delete");
			};
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Advertisement> listAdvertisement() {

		List<Advertisement> list = new ArrayList<Advertisement>();
		try {
			DatabaseConnection dbc = new DatabaseConnection();
			list = dbc.listAdvertisement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String args[]) {
		Advertisement ad = new Advertisement();
		ad.setID(3);
		ad.setAddress("hello3322");

		AdvertisementService as = new AdvertisementService();
		// as.createAdvertisement(ad);
		//as.deleteAdvertisement(1);
		System.out.print(as.listAdvertisement().get(2).getAddress());
	}
}
