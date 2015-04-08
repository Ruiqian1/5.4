public class Car {
	public String color;
	public int horsepower;
	public String engineSize;
	public static int totalCarCount = 0;
	private int count;

	public Car() {
		this.color = "black";
		this.horsepower = 500;
		this.engineSize = "regular";
		totalCarCount++;
		count = totalCarCount;
	}

	public Car(String color, int horsepower, String engineSize) {
		this.color = color;
		this.horsepower = horsepower;
		this.engineSize = engineSize;
		totalCarCount++;
	 	count = totalCarCount;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public String getcolor() {
		return this.color;
	}

	public void sethorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int gethorsepower() {
		return this.horsepower;
	}

	public void setenginSize(String size) {
		this.engineSize=size;

	}

	public String getsize() {
		return this.engineSize;
	}

	public int getcount() {
		return count;
	}
	public static int getTotal(){
		return totalCarCount;
	}

	public boolean equals(Car anothercar) {
		return (this.color.equals(anothercar.color))
				&& (this.horsepower == anothercar.horsepower)
				&& (this.engineSize.equals(anothercar.engineSize));
	}

	public String toString(Car carnumber) {
		return "The car number " + carnumber.getcount() + " is " + this.color
				+ ". It has the horsepower of " + this.horsepower
				+ ". And its engine size is " + this.engineSize + ".";
	}
}
