package n11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brand lenovo=new Brand("Lenovo", "lenovologo.png");
		Brand monster=new Brand("Monster", "monsterlogo1.png");
		Brand sandisk=new Brand("Sandisk", "sandisk.png");
		Brand kingston=new Brand("Kingston", "kingston.png");
		Brand hiLevel=new Brand("High Level", "hl.png");
		Brand microsoft=new Brand("Microsoft", "microsoft.png");
		Brand apple=new Brand("Apple","applelogo.png");
		
		ComputerType notebook=new ComputerType("Notebook","");
		ComputerType desktop=new ComputerType("Masaüstü","");
		ComputerType ultrabook=new ComputerType("Ultrabook","");
		ComputerType tablet=new ComputerType("Tablet","");
		
		Hdd hdd1= new Hdd("512 GB SSD M.2 2242 PCIe® 4.0x4 NVMe®",kingston,"2.5inç",true,false,524288);
		
		OperatingSystem windowsHome32=new OperatingSystem("Windows Home 32Bit",microsoft,32);
		OperatingSystem windowsPro64=new OperatingSystem("Windows Pro 64Bit",microsoft,64);
		OperatingSystem ios64=new OperatingSystem("IOS 64 Bit",apple,64);
		
		Product lenovo1=new Product("Lenovo V15 G4 AMN 82YU00QYTX R5-7520U 16 GB 512 GB SSD 15.6\" Dos FHD Dizüstü Bilgisayar",4.8,10999,lenovo,notebook,windowsPro64,hdd1);
		Product lenovo2=new Product("Lenovo V15 G4 A",4.8,10999,lenovo,notebook,windowsPro64,hdd1);
		lenovo1.print();
		lenovo2.print();
		
	}

}
