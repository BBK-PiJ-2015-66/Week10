/**
 * SmartPhone.java
 *
 * extends OldPhone
 */
public class SmartPhone extends MobilePhone {
		

	/**
	 * Just print on the screen: "Web browsed ...".
	 */
	public void browseWeb(String web) {

		System.out.println("\n Browsing... " + web);
	}

	public void findPosition(String position) {

		System.out.println("\n GPS Position... " + position + " found.");
	}

}