package perfumeriShop;

public class Perfume {
	private String name;
	private String brand;
	private double price;
	private boolean man;
	private boolean women;
	private double amount;
	public Perfume() {
		super();
	}
	public Perfume(String name, String brand, double price, boolean man, boolean women) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.man = man;
		this.women = women;
	}
	public Perfume(String name, String brand, double price, boolean man, boolean women, double amount) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.man = man;
		this.women = women;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public boolean isWomen() {
		return women;
	}
	public void setWomen(boolean women) {
		this.women = women;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


}
