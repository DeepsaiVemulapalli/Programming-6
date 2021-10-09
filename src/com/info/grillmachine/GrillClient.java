package com.info.grillmachine;

import com.builder.grill.GrillBuilder;
import com.builder.grill.GrillMachineProp;

public class GrillClient {
	public static void main(String[] args) {
		// Builder Pattern
		GrillMachineProp coal = new GrillBuilder().setBrand("Prestige").setType("Coal").setPrice(8000).build();
		GrillMachineProp electric = new GrillBuilder().setBrand("Preethi").setType("Electric").setPrice(10000).build();
		System.out.println(coal);
		System.out.println(electric);

	// State pattern to cook grill Chicken 	
		GrillMachine grillMachine = new GrillMachine();

		grillMachine.machineOn();
		grillMachine.cookChicken(10);
		grillMachine.serveChicken(5);
		grillMachine.machineOff();
	}

}
