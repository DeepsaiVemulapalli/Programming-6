package com.info.grillmachine;

public class GrillMachine {
	
	GrillMachineState machineOff;
	
	GrillMachineState machineOn;
	
	GrillMachineState cookChicken;

	GrillMachineState serveChicken;
	
	GrillMachineState state;
	

	

	
	int noOfChicken =10;
	
	public GrillMachine() {
		
		machineOff = new MachineOff(this);
		machineOn= new MachineOn(this);
		cookChicken = new CookChicken(this);
		serveChicken = new ServeChickenGuest(this);
		
		state= machineOn;
		
		if(noOfChicken<0) {
			state= machineOff;
		}
		
	}
	
	public void setState(GrillMachineState newState) {
		state = newState;
	}
	

	public void setCookChicken(int noChickentoCook) {
		noOfChicken = noChickentoCook;
	}
	
	public void machineOn() {
		state.onMachine();
	}
	
	public void machineOff() {
		state.offMachine();
	}
   
	public void cookChicken(int noOfChicken) {
		state.cookChicken(noOfChicken);
	}
	
	public void serveChicken(int noOfChicken) {
		state.serveChicken(noOfChicken);
	}
	
	public GrillMachineState getOffState() {
		return machineOff;
	}
	
	public GrillMachineState getOnState() {
		return machineOn;
	}
	
	public GrillMachineState getCookingState() {
		return cookChicken;
	}
	
	public GrillMachineState getServeState() {
		return serveChicken;
	}
	
}
