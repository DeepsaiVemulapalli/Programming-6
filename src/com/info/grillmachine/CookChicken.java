package com.info.grillmachine;

public class CookChicken implements GrillMachineState {

	GrillMachine grillmachine;
	
	
	
	public CookChicken(GrillMachine newGrillmachine) {
		grillmachine = newGrillmachine;
	}

	@Override
	public void onMachine() {
		// TODO Auto-generated method stub
       System.out.println("Already machine is ON don't try to turn on");
       grillmachine.setState(grillmachine.getOnState());
	}

	@Override
	public void offMachine() {
		// TODO Auto-generated method stub
	       System.out.println("Machine off");
          grillmachine.setState(grillmachine.getOffState());
	}

	@Override
	public void cookChicken(int noOfChicken) {
		// TODO Auto-generated method stub
        if(noOfChicken>0) {
        	System.out.println(" Number of chickens to be cooked "+noOfChicken);
        	grillmachine.setState(grillmachine.getCookingState());;
        }
        else {
        	System.out.println("No chickens to be cooked ");
        	grillmachine.setState(grillmachine.getOffState());
        }
	}

	@Override
	public void serveChicken(int noOfChicken) {
		// TODO Auto-generated method stub
    	System.out.println("No of chickens to served ===> "+noOfChicken);

	}

}
