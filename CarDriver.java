import javax.swing.JOptionPane;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color1, color2, color3, size1, size2, size3, power1, power2, power3;
		int a, b, c;
		color1 = JOptionPane.showInputDialog(null,
				"Enter the color of the first car.");
		power1 = JOptionPane.showInputDialog(null,
				"Enter the horsepower of the first car.");
		a = Integer.parseInt(power1);
		size1 = JOptionPane.showInputDialog(null,
				"Enter the engine size of the first car.");
		Car car1 = new Car(color1, a, size1);
		color2 = JOptionPane.showInputDialog(null,
				"Enter the color of the second car.");
		power2 = JOptionPane.showInputDialog(null,
				"Enter the horsepower of the second car.");
		b = Integer.parseInt(power2);
		size2 = JOptionPane.showInputDialog(null,
				"Enter the engine size of the second car.");
		Car car2 = new Car();
		car2.setcolor(color2);
		car2.sethorsepower(b);
		car2.setenginSize(size2);
		Car car3 = new Car();
		color3 = JOptionPane.showInputDialog(null,
				"Enter the color of the third car.");
		power3 = JOptionPane.showInputDialog(null,
				"Enter the horsepower of the third car.");
		c = Integer.parseInt(power3);
		size3 = JOptionPane.showInputDialog(null,
				"Enter the engine size of the third car.");
		car3.color = color3;
		car3.horsepower = c;
		car3.engineSize = size3;
		JOptionPane.showMessageDialog(null,"There are totally " + Car.totalCarCount+ " cars.");
		JOptionPane.showMessageDialog(null, car1.toString(car1));
		JOptionPane.showMessageDialog(null, car2.toString(car2));
		JOptionPane.showMessageDialog(null, car3.toString(car3));
		Car car4 = new Car("red", 500, "regular");
		JOptionPane
				.showMessageDialog(
						null,
						"The statement that the car number 1 and the car bumber 4 have the same feature is "
								+ car1.equals(car4));
	
	}

}
