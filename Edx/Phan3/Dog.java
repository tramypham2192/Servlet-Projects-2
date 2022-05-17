package Phan3;

public class Dog extends Pet {
	private double droolRate;
	
	//constructor
	public Dog(String name, double health, int painLevel, double droolRate) {
		super(name, health, painLevel);
		if (droolRate <= 0) {
			this.droolRate = 0.5;
		} else {
			this.droolRate = droolRate;
		}
	}
	
	public Dog(String name, double health, int painLevel) {
		super(name, health, painLevel);
		this.droolRate = 0.5;
	}
	
	//treat method implement abstract treat method in Pet class
	public int treat() {
		int minutesSpent = 0;
		heal();
		if (this.droolRate < 3.5) {
			minutesSpent = (int) ((this.getPainLevel() * 2)/this.getHealth());
		} else if (this.droolRate >= 3.5 && this.droolRate <= 7.5) {
			minutesSpent = (int) (this.getPainLevel()/this.getHealth());
		} else {
			minutesSpent = (int)(this.getPainLevel()/(this.getHealth() * 2));
		}
		return minutesSpent;
	}
	
	//speak
	public void speak() {
		super.speak();
		String bark = "";
		
		for (int i = 0; i < this.getPainLevel(); i++) {
			bark += "bark";
		}
		if (this.getPainLevel() <= 5) {
			System.out.println(bark);
		} else {
			System.out.println(bark.toUpperCase());
		}
	}
	
	//
}
