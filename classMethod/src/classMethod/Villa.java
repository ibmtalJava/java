package classMethod;

public class Villa {
	public String name;
	public double m2;
	public double m2BetonPrice;
	public double m2DemirPrice;
	public double m2iscilikPrice;
	public double hesapla() {
		return this.m2*this.m2BetonPrice+this.m2*this.m2DemirPrice
				+this.m2*this.m2iscilikPrice;
	}
	public double arsaHesap() {
		return this.m2*3;

	} 
	

}
