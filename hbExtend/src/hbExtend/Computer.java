package hbExtend;

public class Computer {
	private String name;
	private Brand brand;
	private double price;
	private double stockQuan;
	private Mainboard mainboard;
	public Computer() {
		super();
	}
	public Computer(String name, Brand brand, double price, double stockQuan, Mainboard mainboard) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stockQuan = stockQuan;
		this.mainboard = mainboard;
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
	public Mainboard getMainboard() {
		return mainboard;
	}
	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	
	
}
