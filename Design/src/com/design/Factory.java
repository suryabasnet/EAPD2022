package com.design;

public abstract class Factory {
	public static Factory carFactory=null;
	public static Factory truckFactory=null;
	
	public abstract Engine getEngine();
	public abstract Tyre getTyre();
	
	
	public static Factory getFactory(String vehicleType) throws UnknownVehicleTypeException {
		
		if(vehicleType==null) {
			return null;
		}
		
		Factory factory;
		
		switch(vehicleType) {
		
		case "car":
			if(carFactory==null) {
				carFactory=new CarFactory();
			}
			factory=carFactory;
						
			break;
		case "truck":
			if(truckFactory==null) {
				truckFactory=new TruckFactory();
			}
			factory=truckFactory;
			
			break;
			
			default:
				throw new UnknownVehicleTypeException();
		
		}
		return factory;
		
		
		
		
	}
	

}
