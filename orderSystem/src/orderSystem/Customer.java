package orderSystem;

public class Customer {
	public String Customername;
	public String name;
	public String surname;
	public String pone;
	public String email;
	public String adress;
	public String locationLlng;
	public boolean isActive;
	public double rating;
	public Customer() {
		super();
	}
	public Customer(String customername, String name, String surname, String pone, String email, String adress,
			String locationLlng, boolean isActive, double rating) {
		super();
		Customername = customername;
		this.name = name;
		this.surname = surname;
		this.pone = pone;
		this.email = email;
		this.adress = adress;
		this.locationLlng = locationLlng;
		this.isActive = isActive;
		this.rating = rating;
	}
	

}
