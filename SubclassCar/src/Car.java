
public abstract class Car {

	private double price;
	
	public Car(double cost) {
		this.price = cost * 2;
	}

	public double getPrice() {
		return price;
	}
}
