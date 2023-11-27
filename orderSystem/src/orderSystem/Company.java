package orderSystem;

public class Company {
	public String name;//isim
	public String logo;
	public String address;
	public String phone;
	public String email;
	public boolean isActive;//aktif
	public String locationLlng;
	public double rating;
	public boolean complatedPayment;
	public boolean unComplatedPayment;
	public Company() {
		super();
	}
	public Company(String name, String logo, String address, String phone, String email, boolean isActive,
		 String locationLlng ,double rating, boolean complatedPayment, boolean unComplatedPayment) {
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
