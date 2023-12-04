package shoestore;

public class Sneakers extends Shoe {
	private String sportType;
	private boolean isThickSole;
	public Sneakers(String caption, double size, double price, String photo,String sportType, boolean isThickSole) {
		super(caption,size,price,photo);
		this.sportType = sportType;
		this.isThickSole = isThickSole;
	}
	public Sneakers() {
		super();
	}
	public String getSportType() {
		return sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	public boolean isThickSole() {
		return isThickSole;
	}
	public void setThickSole(boolean isThickSole) {
		this.isThickSole = isThickSole;
	}
}
