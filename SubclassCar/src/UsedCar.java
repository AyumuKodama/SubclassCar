
public class UsedCar extends Car {

	private int mileage;
	
	public UsedCar(double price, int mileage) {
		super(price);
		this.mileage = mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public boolean equals(UsedCar usedCar) {
		boolean same;
		boolean condition1 = (this.getPrice() == usedCar.getPrice());
		boolean condition2 = (this.getMileage() == usedCar.getMileage());
		
		if (condition1 && condition2) {
			same = true;
		} else {
			same = false;
		}
		
		return same;
	}
	
	public void display() {
		System.out.println("price = $" + getPrice() + ", mileage = " + mileage);
	}
}
