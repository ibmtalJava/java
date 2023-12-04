package perfumeriShop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Perfume> perfumes=new ArrayList<Perfume>();
		perfumes.add(new Perfume("Kadýn Parfüm 228 Oriental 50 ml", "Bargelle",230, false, true, 50));
		perfumes.add(new Perfume("Wish Of Love Kadýn Parfüm Edt 50 ml 3'lü Set", "AVON",215, false, true, 50));
		perfumes.add(new Perfume("Erkek Siyah Erkek Black Magic Parfüm 100 ml", "Avva",199.89, true, false, 100));
		for(Perfume parfum:perfumes) {
			System.out.println("------"+parfum.getName()+"------");
			System.out.println(parfum.getBrand()+"-"+parfum.getAmount()+"ml");
			System.out.println(parfum.getPrice()+"TL");
			if(parfum.isMan()) System.out.println("ERKEK PARFÜMÜ");
			if(parfum.isWomen()) System.out.println("KADIN PARFÜMÜ");
		}
	}

}
