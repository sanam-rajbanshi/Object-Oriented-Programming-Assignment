package workshop;


class box{
	double width, height, depth;

    public box() {
        width = 10;
        height = 8;
        depth = 12;
    }
	

    public box(double length) {
        width = length;
        height = length;
        depth = length;
    }
	

    public box(double width, double height, double depth) {
    	this.width = width;
    	this.height = height;
    	this.depth = depth;
    }
    
	public void getVolume() {
		double volume = width * height * depth;
        System.out.println("Volume = " + volume);
		
	}
	
}
public class question_9 {

	public static void main(String[] args) {

    box b1 = new box();
    b1.getVolume();

    box b2 = new box(5);
    b2.getVolume();

    box b3 = new box(4, 5, 6);
    b3.getVolume();
}

}
