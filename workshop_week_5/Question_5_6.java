package week_5;

abstract class vehicle{
	abstract void wheel();
	void door() {
		System.out.println("I am door");
	}
}

class bus extends vehicle{
	public void wheel() {
		System.out.println("I am wheel ");
	}
}

public class Question_5_6 {

}
