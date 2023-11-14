package org.lessons.java.shop;

public class Headphones extends Prodotto {

	private String color;
	private boolean isWireless;
	
	public Headphones(String name, String description, float price, float iva, String color, boolean isWireless) {
		super(name, description, price, iva);
		
		setColor(color);
		setWireless(isWireless);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	@Override
	public float discountPrice() {
		
		if(isWireless) {
			return super.discountPrice();
		} else {
			return super.fullPrice() - (super.fullPrice() * 0.07f);
		}
	}
	
	@Override
	public String toString() {
		
		return "\nNuove Cuffie\n" + super.toString()
				+ "\nColore delle cuffie: " + color +"\n"
				+ (isWireless ? "Le cuffie sono Wireless" : "Le cuffie sono Cablate")
				+ "\n---------------------------------\n";
	}
}
