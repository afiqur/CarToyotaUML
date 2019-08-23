package ARP;

public class Toyota extends Car implements ToyotaService{
	private double price;
	private String prodYear, regNumber;
	Engine e;
	Dashboard d;

	public Toyota(String model, String company, double price, String prodYear, String regNumber, Engine e,
			Dashboard d) {
		super(model, company);
		this.price = price;
		this.prodYear = prodYear;
		this.regNumber = regNumber;
		this.e = e;
		this.d = d;
	}

	public void display() {
		super.display();
		System.out.println(price + " " + prodYear + " " + regNumber);
		e.display();
		d.display();
	}

	public void changeFuel() {
		System.out.println("Changing Fuet...");
	}

	public void checkBattery() {
		System.out.println("Checking Battery...");
	}

	public static void main(String[] args) {
		Engine e = new Engine(5.5);
		Dashboard d = new Dashboard(6.6);
		Toyota t = new Toyota("AWN550", "BMW", 10000000.00, "2018", "52685485", e, d);
		t.display();
		t.changeFuel();
		t.checkBattery();
		t.drive();
		t.stop();

	}

}



