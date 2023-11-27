import jdk.vm.ci.code.site.Site;

public class Order {
	public String ordernumber;
	public String customer;
	public String customerNote;
	public String Company;
	public double orderdate;
	public double cost;
	public double  isReady;
	public double isDelivered;
	public boolean  cpaymentlsCash;
	public boolean   cpaymentlscratitCart;
	public  String deliveryPerson;
	public  double deliveryrayting;
	
	
	
	public Order(String ordernumber, String customer, String customerNote, String company, double orderdate,
			double cost, double isReady, double isDelivered, boolean cpaymentlsCash, boolean cpaymentlscratitCart,
			String deliveryPerson, double deliveryrayting) {
		super();
		this.ordernumber = ordernumber;
		this.customer = customer;
		this.customerNote = customerNote;
		Company = company;
		this.orderdate = orderdate;
		this.cost = cost;
		this.isReady = isReady;
		this.isDelivered = isDelivered;
		this.cpaymentlsCash = cpaymentlsCash;
		this.cpaymentlscratitCart = cpaymentlscratitCart;
		this.deliveryPerson = deliveryPerson;
		this.deliveryrayting = deliveryrayting;
	}
	public Order() {
		super();
	}
	
		

	

}
