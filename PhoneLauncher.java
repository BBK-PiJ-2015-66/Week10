//PhoneLauncher.java
/**
 * creats a SmartPhone and use all its methods
 * including those inherited from its ancestor classes 
 */

public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		
		launcher.launch();
	}

	public void launch() {

		SmartPhone sPhone1 = new SmartPhone();
		sPhone1.call("+44 (0) 00 0000 0001");

		SmartPhone sPhone2 = new SmartPhone();
		sPhone2.call("+44 (0) 00 0000 0002");

		SmartPhone sPhone3 = new SmartPhone();
		sPhone3.call("+44 (0) 00 0000 0003");

		SmartPhone sPhone4 = new SmartPhone();
		sPhone4.call("+44 (0) 00 0000 0004");

		SmartPhone sPhone5 = new SmartPhone();
		sPhone5.call("+44 (0) 00 0000 0005");

		SmartPhone sPhone6 = new SmartPhone();
		sPhone6.call("+44 (0) 00 0000 0006");

		SmartPhone sPhone7 = new SmartPhone();
		sPhone7.call("+44 (0) 00 0000 0007");

		SmartPhone sPhone8 = new SmartPhone();
		sPhone8.call("+44 (0) 00 0000 0008");

		SmartPhone sPhone9 = new SmartPhone();
		sPhone9.call("+44 (0) 00 0000 0009");

		SmartPhone sPhone10 = new SmartPhone();
		sPhone10.call("+44 (0) 00 0000 0010");

		SmartPhone sPhone11 = new SmartPhone();
		sPhone11.call("+44 (0) 00 0000 0011");

		SmartPhone sPhone12 = new SmartPhone();
		sPhone12.call("+44 (0) 00 0000 0012");

		sPhone1.ringAlarm("Marimba...");

		sPhone1.playGame("Football");

		String [] mobNumbers = new String[12];

		mobNumbers[0]  = "+44 (0) 00 0000 0001";
		mobNumbers[1]  = "+44 (0) 00 0000 0002";
		mobNumbers[2]  = "+44 (0) 00 0000 0003";
		mobNumbers[3]  = "001 (0) 00 0000 0004";
		mobNumbers[4]  = "+44 (0) 00 0000 0005";
		mobNumbers[5]  = "+44 (0) 00 0000 0006";
		mobNumbers[6]  = "+44 (0) 00 0000 0007";
		mobNumbers[7]  = "+44 (0) 00 0000 0008";
		mobNumbers[8]  = "+44 (0) 00 0000 0009";
		mobNumbers[9]  = "001 (0) 00 0000 0010";
		mobNumbers[10] = "+44 (0) 00 0000 0011";
		mobNumbers[11] = "+44 (0) 00 0000 0012";

		SmartPhone sPhone = new SmartPhone();
		sPhone.printLastNumbers(mobNumbers);


		sPhone1.browseWeb("bbk.ac.uk");

		sPhone1.findPosition("Malet St, London WC1E 7HX");
	
	}
}