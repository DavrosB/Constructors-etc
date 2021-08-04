package com.qa.constructors;

public class Runner {
	
	public static void main(String[] args) {
		
	cocktails newDrink = new cocktails("Margarita", "Tequila", 2,"Lime Juice", false);
	cocktails newDrink2 = new cocktails("Cheeky Vimto", "Port", 3, "Blue WKD", false);	
	cocktails newDrink3 = new cocktails("Woo Woo", "Vodka", 2, "Peach Schnapps", true);
	cocktails newDrink4 = new cocktails("Long Island Iced Tea", "Gin", 2, "Rum", false);
		
	
	
	System.out.println("----------------------------");
	System.out.println(newDrink.name);
	System.out.println(newDrink.booze);
	System.out.println(newDrink.shots);
	System.out.println(newDrink.mixers);
	System.out.println(newDrink.cherry);
	System.out.println("----------------------------");
	System.out.println(newDrink2.name);
	System.out.println(newDrink2.booze);
	System.out.println(newDrink2.shots);
	System.out.println(newDrink2.mixers);
	System.out.println(newDrink2.cherry);
	System.out.println("----------------------------");
	System.out.println(newDrink3.name);
	System.out.println(newDrink3.booze);
	System.out.println(newDrink3.shots);
	System.out.println(newDrink3.mixers);
	System.out.println(newDrink3.cherry);
	System.out.println("----------------------------");
	
	cocktails.getCocktail("Black Russian ", "Vodka ", 2, " Coke ", false);
	
	
	
	}

	
}
