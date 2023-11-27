package gettersetter;

public class Shoe {
	private String name;
	private String brand;
	private double size;
	private double price;
	public Shoe(String name,String brand,double size,double price) {
		this.name=name;
		this.brand=brand;
		this.size=size;
		this.price=price;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
