package entities;

public class Phone {

	private boolean isOn = false;
	private String color;
	private Integer volume = 10; //max is 10
	
	public Phone(String color) {
		this.color = color;
	}

	public boolean isOn() {
		return isOn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getVolume() {
		return volume;
	}
	
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public void plusVolume() {
		if (this.volume == 10) return;
		this.volume += 2;
	}
	
	public void minusVolume() {
		if (this.volume == 0) return;
		this.volume -= 2;
	}
	
}
