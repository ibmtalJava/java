package footballManager;

public class Main {

	public static void main(String[] args) {
		Clup fenerbahce=new Clup("Fenerbah�e","");
		Clup celtic=new Clup("Celtic", "");
		Position goalKeaper=new Position("Kaleci", false, true);
		Position atackingMidfielder=new Position("�ifty�nl� Ortasaha", true, true);
		Position defenciveMidfielder=new Position("Defansif Ortasaha", false, true);
		Player ismailYuksek=new Player("�smail", "Y�ksek", "14.08.2000", "",fenerbahce );
		ismailYuksek.position=defenciveMidfielder;
		System.out.println(ismailYuksek.clup.name);
		ismailYuksek.clup=celtic;
		ismailYuksek.position=atackingMidfielder;
		System.out.println(ismailYuksek.clup.name);
		
	}

}
