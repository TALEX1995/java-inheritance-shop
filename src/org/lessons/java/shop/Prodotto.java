package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int code;
	private String name;
	private String description;
	private float price;
	private float iva;
	
//	Constructor
	public Prodotto(String name, String description, float price, float iva) {
		this.code = generateCode();
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		
	}
	
//	Generate random code
	public int generateCode() {
		Random rand = new Random();
		int n = rand.nextInt(0, Integer.MAX_VALUE);
		return n;
	}
	
	public int getCode() {
		return code;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getIva() {
		return iva;
	}
	
	public void setIva(float iva) {
		this.iva = iva;
	}
	
//	Full Name, code + name
	public String fullName() {
		return code + "-" + name;
	}
	
//	Full price
	public float fullPrice() {
		float totIva = price * iva / 100;
		
		float totalPrice = price + totIva;
	
		return totalPrice;
	}
	
//	Formatted code
	public String fullCode() {	
			
		String codeString = String.valueOf(code);
	    int zerosToAdd = Math.max(0, 8 - codeString.length());

	    String finalCode = codeString;
	    for (int i = 0; i < zerosToAdd; i++) {
	    	finalCode = 0 + finalCode;
	    }

	    return finalCode;
	}
	
	public float discountPrice() {
		return fullPrice() - (fullPrice() * 0.02f);
	}
	
	@Override
	public String toString() {
		return "Code: " + code + "\nName: " + name 
				+ "\nDescription: " + description 
				+ "\nPrice: " + price 
				+ "\nIva: " + iva 
				; 
	}
	
}
