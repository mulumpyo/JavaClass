package com.yedam.inheritance;

public class PhoneExe {

	public static void main(String[] args) {
		CellPhone phone1 = new CellPhone();
		phone1.model = "SM-G991";
		phone1.color = "graphite";
		phone1.powerOn();
		phone1.powerOff();
		
		CellPhone phone2 = new SmartPhone();
		phone2.model = "SM-F717";
		phone2.color = "violet";
		phone2.powerOn();
		phone2.powerOff();
//		phone2.fold();
		
		SmartPhone phone3 = null;
		if (phone2 instanceof SmartPhone) {
			phone3 = (SmartPhone) phone2;
			phone3.channel = 2;
			phone3.watch();
		}
		
	}

}
