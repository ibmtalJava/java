package fm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City bolu=new City("Bolu","Türkiye", 325000, "");
		City istanbul=new City("istanbul", "Türkiye", 18750000, "");
		Stad boluataturk=new Stad("Bolu Atatürk Stadyumu", 15300, "", bolu);
		System.out.println(boluataturk.name);
	}

}
