package fm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City bolu=new City("Bolu","T�rkiye", 325000, "");
		City istanbul=new City("istanbul", "T�rkiye", 18750000, "");
		Stad boluataturk=new Stad("Bolu Atat�rk Stadyumu", 15300, "", bolu);
		System.out.println(boluataturk.name);
	}

}
