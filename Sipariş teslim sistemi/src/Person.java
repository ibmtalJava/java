
public class Person {
	public String name;//isim
	public String surneym;
	public String phone;
	public String photo;
	public double rating;
	public boolean complatedPayment;
	public boolean unComplatedPayment;
	public boolean isActive;//aktif
	public double locationLlng;
	public Person() {
		super();
	}
	public Person(String name, String surneym, String phone, String photo, double rating, boolean complatedPayment,
			boolean unComplatedPayment, boolean isActive, double locationLlng) {
		super();
		this.name = name;
		this.surneym = surneym;
		this.phone = phone;
		this.photo = photo;
		this.rating = rating;
		this.complatedPayment = complatedPayment;
		this.unComplatedPayment = unComplatedPayment;
		this.isActive = isActive;
		this.locationLlng = locationLlng;
	}
	

	
	
	
}
