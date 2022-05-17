package Phan3;

import java.text.DateFormat;

public class File {
	protected String fileName;
	protected Pet newPet;
	protected AppointmentInfo newAppInfo;
	protected DateFormat timeOut;
	
 File (String fileName, Pet newPet, 
		 AppointmentInfo newAppInfo, DateFormat timeOut) {
		this.fileName = fileName;
		this.newPet = newPet;
		this.newAppInfo = newAppInfo;
		this.timeOut = timeOut;
	}
}
