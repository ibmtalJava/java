package shoestore;

public class Shoe {
	private String caption;
	private double size;
	private double price;
	private String photo;
	public Shoe() {
		super();
	}
	public Shoe(String caption, double size, double price, String photo) {
		super();
		this.caption = caption;
		this.size = size;
		this.price = price;
		this.photo = photo;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
