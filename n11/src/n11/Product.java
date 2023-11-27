package n11;

public class Product {
	public String name;
	public double puan;
	public double price;
	public Brand brand;
	public ComputerType type;
	public OperatingSystem os;
	public Hdd hdd;
	public Product() {
		super();
	}
	public Product(String name, double puan, double price, Brand brand, ComputerType type, OperatingSystem os,
			Hdd hdd) {
		super();
		this.name = name;
		this.puan = puan;
		this.price = price;
		this.brand = brand;
		this.type = type;
		this.os = os;
		this.hdd = hdd;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println("Puan :"+this.puan);
		System.out.println("Fiyat :"+this.price+" TL");
		System.out.println("Marka :"+this.brand.name);
		System.out.println("Sistem :"+this.os);
		
	}
}
