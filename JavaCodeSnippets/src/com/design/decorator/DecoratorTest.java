package com.design.decorator;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		//For creating the basic bike
		Bike basicBike = new BasicBike();
		basicBike.manufacture();
		System.out.println("----------");
		//For creating the fancy bike
		Bike fancyBike = new FancyBike(new BasicBike());
		fancyBike.manufacture();
		
	}

}

interface Bike {
	void manufacture();
}

class BasicBike implements Bike {
	@Override
	public void manufacture() {
		System.out.println("Basic Bike manufactured");
	}
}

class BikeDecorator implements Bike {
	
	protected Bike bike;
	
	public BikeDecorator(Bike bike) {
		this.bike = bike;
	}
	@Override
	public void manufacture() {
		this.bike.manufacture();
	}
}

class FancyBike extends BikeDecorator {
	
	public FancyBike(Bike bike) {
		super(bike);
	}
	
	@Override
	public void manufacture() {
		bike.manufacture();
		System.out.println("Fancy features are added to bike");
	}
}
