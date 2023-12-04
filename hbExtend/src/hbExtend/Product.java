package hbExtend;

public class Product {
	private String name;
	private Brand brand;
	private double price;
	private double stockQuan;
	private String photo;
	public Product() {
		super();
	}
	public Product(String name, Brand brand, double price, double stockQuan, String photo) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stockQuan = stockQuan;
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getStockQuan() {
		return stockQuan;
	}
	public void setStockQuan(double stockQuan) {
		this.stockQuan = stockQuan;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
