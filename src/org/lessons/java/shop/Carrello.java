package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		Prodotto[] products = new Prodotto[10];
		
		int indexProducts = 0;
		
		while(true) {
			
			System.out.println("Vuoi aggiungere un prodotto? Scrivi no per terminare altrimenti si per inserire un prodotto");
			String addProduct = in.nextLine().toLowerCase();
			
			
//			Check if user want to add product
			if(addProduct.equals("no")) {
				
//				Print all the product
				for (int i = 0; i < products.length; i++) {
			        if (products[i] != null) {
			            System.out.println(products[i].toString());
			        }
			    }
				
//				Request if user have fidelity card
				System.out.println("Hai una carta fedeltà? Rispondi si o no");
				String card = in.nextLine().toLowerCase();
				
//				Sum with discount and without
				float sum = 0;
				float discountedSum = 0;
				
//				Cicle to sum all the price
				for (int i = 0; i < products.length; i++) {
			        if (products[i] != null) {
			            
			        	if(card.equals("si")) {
			        		discountedSum += products[i].discountPrice();
						} else {
							sum += products[i].fullPrice();
						}
			        }
			    }
				
				if(card.equals("si")) {
					System.out.println("Considerando il possesso della carta fedeltà e applicando lo sconto, il prezzo totale è: " + discountedSum);
				} else {
					System.out.println("Non avendo la carta fedeltà il totale è: " + sum);
				}
				
				in.close();		
				break;
				
			} else {
				
				String productType = "";
//				Request for every type of product
				do {
					System.out.println("Cosa vuoi inserire, uno Smartphone , una tv o delle cuffie?");
					productType = in.nextLine().toLowerCase();
				} while(!productType.equals("smartphone") && !productType.equals("tv") && !productType.equals("cuffie"));
				
				
//				Name
				System.out.println("Inserisci il nome del prodotto");
				String name = in.nextLine();
				
//				Description
				System.out.println("Inserisci la descrizione del prodotto");
				String description = in.nextLine();
				
//				Price
				System.out.println("Inserisci il prezzo del prodotto");
				String price = in.nextLine();
				float floatPrice = Float.parseFloat(price);
				
//				Iva
				System.out.println("Inserisci l'iva del prodotto");
				String iva = in.nextLine();
				float floatIva = Float.parseFloat(iva);
				
				
				
//				request based on product type
				switch(productType) {
				
//				Smartphone
					case "smartphone":
//						Imei Code
						System.out.println("Inserisci il codice IMEI");
						String imeiCode = in.nextLine();
						
//						Memory
						System.out.println("Inserisci la memoria del telefono in GB");
						String memory = in.nextLine();
						int intMemory = Integer.parseInt(memory);
						
//						New smartphone
						Smartphone s = new Smartphone(name, description, floatPrice, floatIva, imeiCode, intMemory);
						products[indexProducts] = s;
						indexProducts++;
						break;
						
//				TV
					case "tv":
//						Dimension
						System.out.println("Inserisci le dimensioni");
						String dimension = in.nextLine();
						int intDimension = Integer.parseInt(dimension);
						
//						Is a smart tv
						System.out.println("Inserisci true se la tv è una smart tv altrimenti inserisci false");
						String smartTv = in.nextLine().toLowerCase();
						boolean isSmart = Boolean.parseBoolean(smartTv);
						
//						New Television
						Television t = new Television(name, description, floatPrice, floatIva, intDimension, isSmart);
						products[indexProducts] = t;
						indexProducts++;
						break;
//				Cuffie	
					case "cuffie":
//						Color
						System.out.println("Inserisci il colore delle cuffie");
						String color = in.nextLine();
						
//						Is headphones wireless
						System.out.println("Inserisci true se le cuffie sono wireless altrimenti inserisci false");
						String wireless = in.nextLine().toLowerCase();
						boolean isWireless = Boolean.parseBoolean(wireless);
						
//						New Headphones
						Headphones h = new Headphones(name, description, floatPrice, floatIva, color, isWireless);
						products[indexProducts] = h;
						indexProducts++;
						break;
				}
			}					
		}
	}
}
