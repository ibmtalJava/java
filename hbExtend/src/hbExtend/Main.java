package hbExtend;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Brand> brands = new ArrayList<Brand>();
		ArrayList<Mainboard> mainboards = new ArrayList<Mainboard>();
		ArrayList<Computer> computers=new ArrayList<Computer>();
		// 0
		brands.add(new Brand("HP", "", "www.hp.com.tr"));
		// 1
		brands.add(new Brand("Aidata", "", "www.aidata.com.tr"));
		// 2
		brands.add(new Brand("Dell", "", "www.dell.com.tr"));
		// 3
		brands.add(new Brand("Macintosh", "", "www.mac.com.tr"));
		// 4
		brands.add(new Brand("Lenovo", "", "www.lenovo.com.tr"));
		// 5
		brands.add(new Brand("Casper", "", "www.casper.com.tr"));
		// 6
		brands.add(new Brand("Asus", "", "www.asus.com.tr"));
		// 7
		brands.add(new Brand("Gigabyte", "", ""));
		// 8
		brands.add(new Brand("Intel", "", ""));
		// 9
		brands.add(new Brand("Foxcon", "", ""));
		// 10
		brands.add(new Brand("Amd", "", ""));
		// 11
		brands.add(new Brand("Kingston", "", ""));
		// 12
		brands.add(new Brand("Fury", "", ""));
		// 13
		brands.add(new Brand("Sandisk", "", ""));
		// 14
		brands.add(new Brand("AData", "", ""));
		// 15
		brands.add(new Brand("NVidia", "", ""));
		// 16
		brands.add(new Brand("MSI", "", ""));
		// 17
		brands.add(new Brand("ZoTech", "", ""));
		// 18
		brands.add(new Brand("TermalTech", "", ""));
		// 19
		brands.add(new Brand("Exper", "", ""));
		// 20
		brands.add(new Brand("Corsair", "", ""));
		// 21
		brands.add(new Brand("CoolerMaster", "", ""));
		// 22
		brands.add(new Brand("Hi-Power", "", ""));
		// 23
		brands.add(new Brand("PowerBost", "", ""));
		// 24
		brands.add(new Brand("Microsoft", "", ""));
		// 25
		brands.add(new Brand("LG", "", ""));
		// 26
		brands.add(new Brand("Samsung", "", ""));
		// 27
		brands.add(new Brand("Philips", "", ""));
		// 28
		brands.add(new Brand("Rampage", "", ""));
		// 29
		brands.add(new Brand("LogiTech", "", ""));
		// 30
		brands.add(new Brand("Razer", "", ""));
		// 31
		brands.add(new Brand("GamePower", "", ""));

		System.out.println(brands.get(26).getName());
		//0
		mainboards.add(new Mainboard("Gigabyte B450M K 3600 MHz (O.C.) DDR4 AM4 mAtx Anakart", brands.get(7), 1999.00,
				148, "https://productimages.hepsiburada.net/s/339/550/110000345905677.jpg/format:webp", false, false,
				3600));
		//1
		mainboards.add(new Mainboard("Asus Prime B550M-K AMD AM4 3.Nesil DDR4 VGA DVI HDMI", brands.get(6), 3199.00, 78,
				"https://productimages.hepsiburada.net/s/41/550/10698354720818.jpg/format:webp", false, true, 4600));
		//2
		mainboards.add(new Mainboard(
				"MSI B450M PRO-VDH MAX AM4 DDR4 3866(OC) 4xDIMM DVI HDMI VGA GLAN M.2 USB3.2 mATX Anakart",
				brands.get(16), 2799.00, 13,
				"https://productimages.hepsiburada.net/s/34/550/10457104449586.jpg/format:webp", false, false, 3866));
		//3
		mainboards.add(new Mainboard("Asus Tuf Gamýng B760M-PLUS Ddr5 Hdmý-Dp Pcýe 4.0 1700P", brands.get(6), 7576.95,
				9, "https://productimages.hepsiburada.net/s/416/550/110000445175547.jpg/format:webp", false, false,
				7200));
		System.out.println(mainboards.get(3).getName());
		//0
		computers.add( new Computer("Lenovo X Carbon",brands.get(4),39784.48, 5, mainboards.get(2)));
		System.out.println("----------------------");
		System.out.println(computers.get(0).getName());
		System.out.println("Marka : "+computers.get(0).getBrand().getName());
		System.out.println("Anakart :"+computers.get(0).getMainboard().getBrand().getName()+" - "+computers.get(0).getMainboard().getName());
	}

}
