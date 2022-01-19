package com.design;

import java.util.Scanner;

public class MyAbastractFactory {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter vehicle type");
		String input=in.nextLine().toLowerCase().trim();
		
		
		Factory factory;
		
		
		try {
			
			factory=Factory.getFactory(input);
			Engine e=factory.getEngine();
			e.design();
			e.manufacturing();
			e.test();
			
			Tyre t=factory.getTyre();
			t.design();
			t.manufacturing();
			

	}
		catch(UnknownVehicleTypeException e) {
		System.out.println("invalid vehicle type");	
		}
		}

}
