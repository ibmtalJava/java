package n11;

public class Hdd {
	public String name;
	public Brand brand;
	public String size;
	public boolean sata;
	public boolean ide;
	public double capacity;
	public Hdd() {
		super();
	}
	public Hdd(String name, Brand brand, String size, boolean sata, boolean ide, double capacity) {
		super();
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.sata = sata;
		this.ide = ide;
		this.capacity = capacity;
	}
}
