package workshop;


class Address{
	private String street;
	private String city;
	private int zipCode;
	
	public String getstreet() {
		return street;
	}
	
	public void setstreet(String street) {
		this.street = street;
	}
	public String getcity() {
		return city;
	}
	
	public void setcity(String city) {
		this.city = city;
	}
	public int getzipCode() {
		return zipCode;
	}
	
	public void setzipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
public class question_11 {
	public static void main(String[] args) {
		Address addr = new Address();
		
	
        addr.setstreet("Main Street");
        addr.setcity("Kathmandu");
        addr.setzipCode(9825);

        
        System.out.println("Street: " + addr.getstreet());
        System.out.println("City: " + addr.getcity());
        System.out.println("Zip Code: " + addr.getzipCode());
    }
	}


