package com.info.grillmachine;

public class ServeChickenGuest implements GrillMachineState {

	GrillMachine grillMachine;
	
	 public ServeChickenGuest(GrillMachine newGrillMachine) {
		// TODO Auto-generated constructor stub
		grillMachine=newGrillMachine;
	}
	
	@Override
	public void onMachine() {
		// TODO Auto-generated method stub
       System.out.println( "Chicken served, on the machine to cook more");
	}

	@Override
	public void offMachine() {
		// TODO Auto-generated method stub
		System.out.println( "Chicken served,off the machine to close the shop ");
	}

	@Override
	public void cookChicken(int noOfChicken) {
		// TODO Auto-generated method stub
		      System.out.println("Chicken cooked ready to serve ");
	}

	@Override
	public void serveChicken(int noOfChicken) {
		// TODO Auto-generated method stub
          System.out.println( "Chicken Serving  to guest");
          grillMachine.setState(grillMachine.getServeState());
	}

}
