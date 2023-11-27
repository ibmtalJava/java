package orderSystem;

public class Main {

	public static void main(String[] args) {
		Company eti=new Company("eti", "", "eti sokak no16", "598532", "gmail yop com", false, "akca aga� malesi", 4,true, false);
		Company �lker=new Company("�lker", "", "�lker sokak no30", "5538532", "gmail yop ,gwcom", false, "akca aga� malesi", 4,false, true);
		
		Customer talha=new Customer("21", "talha", "gok", "2621627", "�dh�wqyugamail.", "turkey", "kocuc",false , 5);
		Customer nihat=new Customer("22", "than", "g�k", "26296827", "gamail.�wqyu", "turkey", "kocuc",false , 9);
		
		Person nino=new Person("nino", "basan", "1672562", "nini gamail.", 54, true, false, true, 7);
		Person lano=new Person("lano", "�aman", "16552562", "lamo gamail.", 84, false, false, true, 9);
		
		
		Product kerm=new Product("kerem", "", 54, 6);
		Product naim=new Product("naim", "", 34, 9);
		Product cihan=new Product("�ihan", "", 64, 6);
		
		OrderProduct cihan1=new OrderProduct("cihan", "cihan","12");
		OrderProduct naim1=new OrderProduct("naim", "naim", "26");
		OrderProduct kerm1=new OrderProduct("kerm", "kerm", "83");
		
		
		System.out.println("hangi firmadan sipati� edildi:"+eti.name);
		System.out.println("firma email:"+eti.email);
		System.out.println("firman�n adresi"+eti.address);
		System.out.println("�irket aktifmi"+eti.isActive);
		System.out.println("kuzey lokasyon"+eti.locationLlng);
		System.out.println("firman�n numaraland�r�lmas�:"+eti.rating);
		System.out.println("odeme yap�ld�m�:"+eti.complatedPayment);	
		
		
		System.out.println("hangi firmadan sipati� edildi:"+�lker.name);
		System.out.println("firma email:"+�lker.email);
		System.out.println("firman�n adresi:"+�lker.address);
		System.out.println("�irket aktifmi:"+�lker.isActive);
		System.out.println("kuzey lokasyon:"+�lker.locationLlng);
		System.out.println("firman�n numaraland�r�lmas�:"+�lker.rating);
		System.out.println("odeme yap�ld�m�:"+�lker.complatedPayment);	
		
	
		System.out.println("m��teri numaraso�:"+talha.Customername);
		System.out.println("m�steri ismi:"+talha.name);
		System.out.println("m�steri numara"+talha.pone);
		System.out.println("musteri email"+talha.email);
		System.out.println("kuzey lkasyonu:"+talha.rating);
		
		System.out.println("m��teri numaraso�:"+nihat.Customername);
		System.out.println("m�steri ismi:"+nihat.name);
		System.out.println("m�steri numara"+nihat.pone);
		System.out.println("musteri email"+nihat.email);
		System.out.println("kuzey lkasyonu:"+nihat.rating);
		
		
		
		
	
	







	}

}
