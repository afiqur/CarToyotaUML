package ARP;

public class Car implements CarService {

	protected String model, company;

	public Car(String model, String company) {
		this.model = model;
		this.company = company;
	}

	public void display() {

		System.out.println(model + " " + company);
	}

	public void drive() {
		System.out.println("Driving...");
	}

	public void stop() {
		System.out.println("Stopped");
	}

}


