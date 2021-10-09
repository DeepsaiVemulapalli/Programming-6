package com.info.grillmachine;

public class MachineOn implements GrillMachineState {

	GrillMachine grillmachine;

	public MachineOn(GrillMachine newGrillmachine) {
		grillmachine = newGrillmachine;
	}
	
	
	@Override
	public void onMachine() {
		// TODO Auto-generated method stub
         System.out.println("Please On the machine to cook ");
         grillmachine.setState(grillmachine.getOnState());
	}

	@Override
	public void offMachine() {
		// TODO Auto-generated method stub
		 System.out.println("Off the machine when the cook is done ");
	}

	@Override
	public void cookChicken(int noOfChicken) {
		// TODO Auto-generated method stub
       System.out.println("please place the chicken in the grill machine");
       grillmachine.setState(grillmachine.getCookingState());
	}

	@Override
	public void serveChicken(int noOfChicken) {
		// TODO Auto-generated method stub
	       System.out.println("please cook  the chicken to serve guest");

	}

}
