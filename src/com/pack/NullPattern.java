package com.pack;

interface Vehicle{
	void start();
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car has been started..");
	}
}
class NullVehicle implements Vehicle{
	@Override
	public void start() {
		System.out.println("Null vehicle");
	}
}
class VehicleFactory{
	public static Vehicle getVehicle(String type) {
		if("car".equalsIgnoreCase(type)) {
			return new Car();
		}else {
			return new NullVehicle();
		}
	}
}
public class NullPattern {

	public static void main(String[] args) {
		Vehicle c=VehicleFactory.getVehicle("car");
		Vehicle b=VehicleFactory.getVehicle("bike");
		
		c.start();
		b.start();
	}

}
