package gettersetter;

public class TShirt {
	private String name;
	private String brand;
	private String size;
	private double price;
	private int stockQuan;
	private boolean overSize;
	public TShirt() {
		super();
	}
	public TShirt(String name, String brand, String size, double price, int stockQuan, boolean overSize) {
		super();
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.stockQuan = stockQuan;
		this.overSize = overSize;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockQuan() {
		return stockQuan;
	}
	public void setStockQuan(int stockQuan) {
		this.stockQuan = stockQuan;
	}
	public boolean isOverSize() {
		return overSize;
	}
	public void setOverSize(boolean overSize) {
		this.overSize = overSize;
	}
	public void print() {
		System.out.println("--------------------------");
		System.out.println("Ürün : "+this.getName());
		System.out.println("     Marka : "+this.getBrand());
		System.out.println("     Beden : "+this.getSize());
		System.out.println("     Over Size : "+this.isOverSize());
		System.out.println("    Stok : "+this.getStockQuan());
		System.out.println("     Fiyat : "+this.getPrice());
		
	}
	public void stockIn(int stockQuan) {
		this.setStockQuan(this.getStockQuan()+stockQuan);
	}
	public void stockOut(int stockQuan) {
		this.setStockQuan(this.getStockQuan()-stockQuan);
	}
	public void makeDiscount(double discountRate) {
		discountRate=discountRate%100;
		this.setPrice(this.getPrice()*(100-discountRate)/100);
	}
	public void makeRaise(double raise) {
		this.setPrice(this.getPrice()*(100+raise)/100);
	}
	
}
