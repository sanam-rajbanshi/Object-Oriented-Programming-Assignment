package week_5;


abstract class shape{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}


class quadrilateral extends shape{
	public void calculateArea() {
		System.out.println("Area is ");
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter formula is  ");
	}
}



