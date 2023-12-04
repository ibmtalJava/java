package shoestore;

public class Boot extends Shoe {
	private boolean isLong;
	private boolean waterProf;
	private double protectionDegress;
	public Boot() {
		super();
	}
	
	public Boot(String caption, double size, double price, String photo,boolean isLong, boolean waterProf, double protectionDegress) {
		this.setCaption(caption);
		this.setSize(size);
		this.setPrice(price);
		this.setPhoto(photo);
		this.isLong = isLong;
		this.waterProf = waterProf;
		this.protectionDegress = protectionDegress;
	}

	public boolean isLong() {
		return isLong;
	}
	public void setLong(boolean isLong) {
		this.isLong = isLong;
	}
	public boolean isWaterProf() {
		return waterProf;
	}
	public void setWaterProf(boolean waterProf) {
		this.waterProf = waterProf;
	}
	public double getProtectionDegress() {
		return protectionDegress;
	}
	public void setProtectionDegress(double protectionDegress) {
		this.protectionDegress = protectionDegress;
	}
}
