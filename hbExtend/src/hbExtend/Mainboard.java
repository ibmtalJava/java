package hbExtend;

public class Mainboard extends Product {
	private boolean wifi;
	private boolean usb31;
	private double speed;
	public Mainboard() {
		super();
	}
	public Mainboard(boolean wifi, boolean usb31, double speed) {
		super();
		this.wifi = wifi;
		this.usb31 = usb31;
		this.speed = speed;
	}
	public Mainboard(String name, Brand brand, double price, double stockQuan, String photo,boolean wifi, boolean usb31, double speed) {
		super(name, brand, price, stockQuan, photo);
		this.wifi = wifi;
		this.usb31 = usb31;
		this.speed = speed;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isUsb31() {
		return usb31;
	}
	public void setUsb31(boolean usb31) {
		this.usb31 = usb31;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
