package gettersetter;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Shoe adidas1=new Shoe("SüperStar","Adidas",43.5,2875);
		Shoe nikeair=new Shoe("Air Jordan","Nike",42,6999.99);
		System.out.println(adidas1.getName());
		adidas1.setName("Süper Star ****");
		System.out.println(adidas1.getName());
		
		
		ArrayList<TShirt> tShirts= new ArrayList<TShirt>();
		tShirts.add(new TShirt("Beyaz das das", "LCW", "L", 99.9, 145, true));
		tShirts.add(new TShirt("Beyaz das das", "LCW", "M", 99.9, 45, true));
		tShirts.add(new TShirt("Beyaz das das", "LCW", "S", 55.99, 20, false));
		tShirts.add(new TShirt("Polo Yaka Siyah tiþört", "Mavi", "XL", 125, 63, false));
		tShirts.get(1).stockIn(63);
		tShirts.get(3).stockOut(12);
/*		
		tShirts.get(0).print();
		tShirts.get(1).print();
		tShirts.get(2).print();
		tShirts.get(3).print();
*/
		for(TShirt tShirt:tShirts) {
			tShirt.makeRaise(20);
		}
		
		for(TShirt tShirt:tShirts) {
			tShirt.makeDiscount(15.7);
		}
		
		for(TShirt tShirt:tShirts) {
			tShirt.print();
		}
		
		ArrayList<Pad> pads=new ArrayList<Pad>();
		pads.add(new Pad("Harita Metod Kareli","Mopak", 80, 148.50));
		pads.add(new Pad("Harita Metod Çizgili","Mopak", 80, 145.50));
		pads.get(1).setPageCount(120);
		pads.get(0).info();
		pads.get(1).info();
	//Pastane projesi oluþturun ve pasta,içecek classlarýný
	//oluþturun. 4 er adet kayýt girin ve tüm ürünleri yazdýrýn
	}

}
