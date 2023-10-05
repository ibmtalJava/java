package carPerformance;

public class Main {

	public static void main(String[] args) {
		String carName="BMW E30";
		double motorPower=112.7;
		int cylinderCount=4;
		double rimSize=16;
		double maxMotorPower=640;
		int maxCylinderSize=16;
		double maxRimSize=23;
		double motorPowerRate=55*motorPower/maxMotorPower;//9.68
		double cylinderSizeRate=25*cylinderCount/maxCylinderSize;//6.25
		double rimSizeRate=20*rimSize/maxRimSize;//13.6
		double carPerformance=motorPowerRate+cylinderSizeRate+rimSizeRate;
		//29.53
		System.out.println("Araba :"+carName);
		System.out.println("    Performans : %"+carPerformance);
		System.out.println("          Motor performansý : %"+motorPowerRate);

	}
//bir evin imalatýnda %20 demir %40 beton %30 tugla %10 tahta kullanýlýr
//Belirtilen metre kareye göre evin maliyetini hesaplayan ve kalem kalem yazdýran 
//houseCost projesini yazýn
}
