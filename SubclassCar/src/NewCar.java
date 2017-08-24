
public class NewCar extends Car {

	private String color;
	
	public NewCar(double price, String color) {
		super(price);
		this.color = color;	
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean equals(NewCar newCar) {
		boolean same;
		boolean condition1 = (this.getPrice() == newCar.getPrice());
		boolean condition2 = this.getColor().equals(newCar.getColor());
		
		if (condition1 && condition2) {
			same = true;
		} else {
			same = false;
		}
		
		return same;
	}
	
	public void display() {
		System.out.println("price = $" + getPrice() + ", color = " + color);
	}
}
