package Phan3;

public abstract class Pet {
	private String name;
	private double health;
	private int painLevel;
	
	//constructor
	public Pet(String name, double health, int painLevel) {
		if (health > 1.0) {
			this.health = 1.0;
		} else if (health < 0.0) {
			this.health = 0.0;
		} else {
			this.health = health;
		}
		
		//pain level
		if (painLevel > 10) {
			this.painLevel = 10;
		} else if (painLevel < 1) {
			this.painLevel = 1;
		} else {
			this.painLevel = painLevel;
		}
	}
	
	//getters setters for name
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	//getter setter for health
	public double getHealth() {
		return this.health;
	}
	public void setHealth(double h) {
		this.health = h;
	}
	
	//getter setter for pain level
	public int getPainLevel() {
		return this.painLevel;
	}
	public void setPainlevel(int p) {
		this.painLevel = p;
	}
	
	//abstract method, return minutes taken to treat the pet
	public abstract int treat();
	
	public void speak() {
		if (this.painLevel <= 5) {
			System.out.println("Hello! My name is " + this.name);
			
		} else {
			System.out.println("HELLO? MY NAME IS " + this.name.toUpperCase());
		}
	}
	
	protected void heal() {
		this.health = 1.0;
		this.painLevel = 1;
	}
}
