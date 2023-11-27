package gettersetter;

public class Pad {
	private String name;
	private String brand;
	private int pageCount;
	private double price;
	public Pad() {
		super();
	}
	public Pad(String name, String brand, int pageCount, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.pageCount = pageCount;
		this.price = price;
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
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void info() {
		System.out.println("--------------");
		System.out.println(this.getName());
		System.out.println("  Marka :"+this.getBrand());
		System.out.println("  Sayfa :"+this.getPageCount());
		System.out.println("  Fiyat :"+this.getPrice());
	}
	
}
