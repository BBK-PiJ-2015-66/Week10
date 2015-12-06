//MobilePhone.java
/**
 * extends OldPhone
 */
public class MobilePhone extends OldPhone {	 	

	/**
	 * Just print on the screen: "Alarm ringing ...".
	 */
	public void ringAlarm(String alarm) {

		System.out.println("\n Ringing... " + alarm);
	}

	public void playGame(String game) {

		System.out.println("\n Playing... " + game + " game.");
	}

	public void printLastNumbers(String [] myNumbers) {

		int count = myNumbers.length;
		String numbers[] = new String[count];

		int startOfLast10Numbers = 0;

		startOfLast10Numbers = count - 10;

		System.out.println("\n Last ten numbers called ... ");

		for(int i = startOfLast10Numbers; i < count; i++) {

			System.out.println(myNumbers[i]);
		}

	}

}