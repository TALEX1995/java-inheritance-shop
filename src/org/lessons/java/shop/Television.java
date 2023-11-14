package org.lessons.java.shop;

public class Television extends Prodotto{
	
	private int dimension;
	private boolean isSmart;
	
	public Television(String name, String description, float price, float iva, int dimension, boolean isSmart) {
		super(name, description, price, iva);
		
		setDimension(dimension);
		setSmart(isSmart);
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	@Override
	public String toString() {

		return super.toString()
				+ "\nDimensioni: " + dimension + " pollici\n"
				+ (isSmart ? "La TV è una Smart TV" : "La TV non è una Smart TV")
				+ "\n---------------------------------\n";
		
	}
}