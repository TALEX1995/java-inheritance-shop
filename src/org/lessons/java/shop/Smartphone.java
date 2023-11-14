package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private String imeiCode;
	private int memory;
	
	public Smartphone(String name, String description, float price, float iva, String imeiCode, int memory) {
		super(name, description, price, iva);
		
		setImeiCode(imeiCode);
		setMemory(memory);
	}

	public String getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		
		return "\nNuovo Smartphone\n" + super.toString()
				+ "\nCodice IMEI: " + imeiCode
				+ "\nMemoria del telefono: " + memory + "GB"
				+ "\n---------------------------------\n";
		
	}
}
