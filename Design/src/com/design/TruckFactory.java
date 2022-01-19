package com.design;

public class TruckFactory extends Factory {

	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}

	@Override
	public Tyre getTyre() {
		return new TruckTyre();
	}

}
