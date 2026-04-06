package week_5;

interface animal {
	void eat();
	void walk();
}
interface printable {
	void display();
	
}



class cow implements animal, printable{
	public void eat() {
		System.out.println("I am eating");
	}
	public void walk() {
		System.out.println("I am walking");
	}
	public void display() {
		System.out.println("I am displaying hiii");
	}
}



