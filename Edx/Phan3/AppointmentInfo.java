package Phan3;

import java.text.DateFormat;

public class AppointmentInfo {
	protected DateFormat timeIn;
	protected double health;
	protected int painLevel;
	protected DateFormat timeOut;
	
	public AppointmentInfo(DateFormat timeIn, double health, int painLevel, DateFormat timeOut) {
		this.timeIn = timeIn;
		this.health = health;
		this.painLevel = painLevel;
		this.timeOut = timeOut;
	}
}
