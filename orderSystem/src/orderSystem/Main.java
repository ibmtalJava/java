package orderSystem;

public class Main {

	public static void main(String[] args) {
		Company eti=new Company("eti", "", "eti sokak no16", "598532", "gmail yop com", false, "akca agaç malesi", 4,true, false);
		Company ülker=new Company("ülker", "", "ülker sokak no30", "5538532", "gmail yop ,gwcom", false, "akca agaç malesi", 4,false, true);
		
		Customer talha=new Customer("21", "talha", "gok", "2621627", "ýdhýwqyugamail.", "turkey", "kocuc",false , 5);
		Customer nihat=new Customer("22", "than", "gük", "26296827", "gamail.ýwqyu", "turkey", "kocuc",false , 9);
		
		Person nino=new Person("nino", "basan", "1672562", "nini gamail.", 54, true, false, true, 7);
		Person lano=new Person("lano", "çaman", "16552562", "lamo gamail.", 84, false, false, true, 9);
		
		
		Product kerm=new Product("kerem", "", 54, 6);
		Product naim=new Product("naim", "", 34, 9);
		Product cihan=new Product("çihan", "", 64, 6);
		
		OrderProduct cihan1=new OrderProduct("cihan", "cihan","12");
		OrderProduct naim1=new OrderProduct("naim", "naim", "26");
		OrderProduct kerm1=new OrderProduct("kerm", "kerm", "83");
		
		
		System.out.println("hangi firmadan sipatiþ edildi:"+eti.name);
		System.out.println("firma email:"+eti.email);
		System.out.println("firmanýn adresi"+eti.address);
		System.out.println("þirket aktifmi"+eti.isActive);
		System.out.println("kuzey lokasyon"+eti.locationLlng);
		System.out.println("firmanýn numaralandýrýlmasý:"+eti.rating);
		System.out.println("odeme yapýldýmý:"+eti.complatedPayment);	
		
		
		System.out.println("hangi firmadan sipatiþ edildi:"+ülker.name);
		System.out.println("firma email:"+ülker.email);
		System.out.println("firmanýn adresi:"+ülker.address);
		System.out.println("þirket aktifmi:"+ülker.isActive);
		System.out.println("kuzey lokasyon:"+ülker.locationLlng);
		System.out.println("firmanýn numaralandýrýlmasý:"+ülker.rating);
		System.out.println("odeme yapýldýmý:"+ülker.complatedPayment);	
		
	
		System.out.println("müþteri numarasoý:"+talha.Customername);
		System.out.println("müsteri ismi:"+talha.name);
		System.out.println("müsteri numara"+talha.pone);
		System.out.println("musteri email"+talha.email);
		System.out.println("kuzey lkasyonu:"+talha.rating);
		
		System.out.println("müþteri numarasoý:"+nihat.Customername);
		System.out.println("müsteri ismi:"+nihat.name);
		System.out.println("müsteri numara"+nihat.pone);
		System.out.println("musteri email"+nihat.email);
		System.out.println("kuzey lkasyonu:"+nihat.rating);
		
		
		
		
	
	







	}

}
