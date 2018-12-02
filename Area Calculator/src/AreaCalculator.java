
public class AreaCalculator {

	public static void main(String[] args) {
		double areaOfCircle 	= area(56.6d);
		System.out.println(areaOfCircle);
		double areaOfRectangle	= area(58.36d,-564.35d);
		System.out.println(areaOfRectangle);
	}
	public static double area(double radius) {
		if(radius < 0) {
			return -1.0;
		}else {
			return 3.14 * radius * radius;
		}
	}
	public static double area (double x,double y) {
		if (x < 0 || y < 0) {
			return -1.0;
		}
			else {
				return x * y;
			}
		}
		
	}

