
public class AdvertiserService {

	public void createAdvertiser(Advertiser ad) {

		try {
			DatabaseConnection dbc = new DatabaseConnection();
			String sql = "insert into 12825612User(ID, username, password, gender, email, Discriminator) values ('"
					+ dbc.getKeys("12825612User") + "','" + ad.getUsername() + "','" + ad.getPassword() + "','"
					+ ad.getGender() + "','" + ad.getEmail() + "','1')";
			System.out.println(sql);
			if (dbc.executeSql(sql)) {
				System.out.println("Created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateAdvertiser(Advertiser ad) {

		try {
			DatabaseConnection dbc = new DatabaseConnection();
			// TODO compelate the cover
			String sql = "update 12825612User set (username, password, email) values ('" + ad.getUsername() + ","
					+ ad.getPassword() + "," + ad.getEmail() + "') where id = " + ad.getID();
			System.out.println(sql);
			if (dbc.executeSql(sql)) {
				System.out.println("Updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAdvertiser(int id) {

		try {
			DatabaseConnection dbc = new DatabaseConnection();
			// TODO compelate the cover
			String sql = "delete from 12825612Advertiser where id = " + id;
			System.out.println(sql);
			if (dbc.executeSql(sql)) {
				System.out.println("delete");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Advertiser findUserbyUsername(String username) {

		Advertiser ad = new Advertiser();
		try {
			DatabaseConnection dbc = new DatabaseConnection();
			ad = dbc.findUserbyUsername(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ad;
	}

}
