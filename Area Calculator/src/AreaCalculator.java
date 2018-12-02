
public class AreaCalculator {

	public static void main(String[] args) {
		String areaOfCircle 	= area(-56.6d);
		System.out.println(areaOfCircle);
		String areaOfRectangle	= area(58.36d,-564.35d);
		System.out.println(areaOfRectangle);
	}
	public static String area(double radius) {
		if(radius < 0) {
			return "-1.0";
		}else {
			double area = 3.14 * radius * radius;
			return "area of cirle  : " +area;
		}
	}
	public static String area (double x,double y) {
		if (x < 0 || y < 0) {
			return "-1.0";
		}
			else {
				double area = x * y;
				return "area of rectangle  : "+area;
			}
		}
		
	}

