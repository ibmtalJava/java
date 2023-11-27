package footballManager;

public class Player {
	public String name;
	public String surname;
	public String birthDay;
	public String photo;
	public Clup clup;
	public Position position;
	public String speed;
	public String stamine;
	public double price;
	public double minFreePrice;
	public String contract;
	public Player() {
		super();
	}
	public Player(String name, String surname, String birthDay, String photo, Clup clup) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
		this.photo = photo;
		this.clup = clup;
	}
	public Player(String name, String surname, String birthDay, String photo, Clup clup, Position position) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
		this.photo = photo;
		this.clup = clup;
		this.position = position;
	}
	
}
