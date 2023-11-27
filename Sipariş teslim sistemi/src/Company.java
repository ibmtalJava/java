
public class Company {
	}
	public String name;//isim
	public String logo;
	public double address;
	public double phone;
	public double email;
	public boolean isActive;//aktif
	public double locationLlng;
	public double rating;
	public boolean complatedPayment;
	public boolean unComplatedPayment;
	public Company() {
		super();
	}
	public Company(String name, String logo, double address, double phone, double email, boolean isActive,
			double locationLlng, double rating, boolean complatedPayment, boolean unComplatedPayment) {
		super();
		this.name = name;
		this.logo = logo;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.isActive = isActive;
		this.locationLlng = locationLlng;
		this.rating = rating;
		this.complatedPayment = complatedPayment;
		this.unComplatedPayment = unComplatedPayment;
	}
	
	
	
	
}
