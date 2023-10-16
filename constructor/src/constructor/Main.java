package constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apartment bahcelidaire=new Apartment("Süperlüx 3+1 Daire",3582000);
		System.out.println(bahcelidaire.caption);
		Apartment kalicidaire=new Apartment("2+1 Kutu gibi daire",2354000);
		System.out.println(kalicidaire.caption);
		System.out.println(bahcelidaire.price);
		
		Apartment saglikd1=new Apartment("Yeni Daire");
		saglikd1.price=168500;
		System.out.println(saglikd1.caption);
		
		
		House mustakilA=new House();
		House mustakilB=new House("Daðkent A Tipi villa",4875000,284,3, true);
		House mustakilC=new House("Elmalýk Villa",3487000,2);
		mustakilA.evBilgileri();
		mustakilB.evBilgileri();
		mustakilC.evBilgileri();
		
		Residence rez1=new Residence();
		Residence rez2=new Residence("MyDream City de süper lüx Rezidans"
				, 784000,234);
		Residence rez3=new Residence("Esas14 Buradada Triblex Rezidans"
				,2540000, 368.7, 8
				, true, true, true, true, true, false, 3, 84.7);
		rez2.infoSmall();
		rez3.infoLarge();
		
		
	}

}
