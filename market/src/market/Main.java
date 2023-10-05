package market;

public class Main {

	public static void main(String[] args) {
		String productApple="Seben Elmasý";
		String productBananas="Anamur Muzu";
		double productAppleCost=65.88;
		double productAppleQuan=14.8;
		double productAppleTotalCost;
		productAppleTotalCost=productAppleCost*productAppleQuan;
		System.out.print("Seben Elmasý");
		System.out.print("     ");
		System.out.print(productAppleQuan);
		System.out.print(" X ");
		System.out.print(productAppleCost);
		System.out.print("     ");
		System.out.println(productAppleTotalCost);
		//kdv=totalCost*20/100;
	//Seben Elmasý      14.8 X 65.88   132165
//		                       KDV      12.48
	//	                       Toplam  148.47
	}

}
