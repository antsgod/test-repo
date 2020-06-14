package com.comanche.DesignMode.structural.decorator;

public class Util {
	public static void printProductDetails(BakeryComponent bComponent) {
		String out = "Item: " + bComponent.getName() + ", " + "Price: " + bComponent.getPrice();
		System.out.println(out);
	}
}
