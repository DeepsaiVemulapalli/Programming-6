package com.info.grillmachine;

public class MachineOff implements GrillMachineState {

	GrillMachine grillmachine;

	public MachineOff(GrillMachine newGrillmachine) {
		grillmachine = newGrillmachine;
	}

	@Override
	public void onMachine() {
		// TODO Auto-generated method stub
      System.out.println("On the Machine ");
	}

	@Override
	public void offMachine() {
		// TODO Auto-generated method stub
		System.out.println("off  the Machine ");
	}

	@Override
	public void cookChicken(int noOfChicken) {
		// TODO Auto-generated method stub
		System.out.println("Machine is off can't cook");
	}

	@Override
	public void serveChicken(int noOfChicken) {
		// TODO Auto-generated method stub
		System.out.println("Can't serve the chicken ");
	}

}
