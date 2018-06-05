/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Technology, Sydney License Type: Academic
 */
public class Advertiser extends User {
	public Advertiser() {
	}

	private String email;

	public void setEmail(String value) {
		this.email = value;
	}

	public String getEmail() {
		return email;
	}

	public boolean register() {
		AdvertiserService ads = new AdvertiserService();
		if(!checkUsername())
		{
			ads.createAdvertiser(this);
			return true;
		}
		return false;
	}

	public boolean checkUsername() {
		AdvertiserService ads = new AdvertiserService();
		if (ads.findUserbyUsername(getUsername()) != null) {
			return true;
		}
		return false;
	}
	
	public boolean login() {
		AdvertiserService ads = new AdvertiserService();
		Advertiser adv = ads.findUserbyUsername(getUsername());
		if (adv != null && adv.getPassword().equals(getPassword())) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return super.toString();
	}

}
