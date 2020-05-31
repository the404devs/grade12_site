package prjOOP;

public class ufc {
	public static void main(String[] args) {
		fighter figh1 = new fighter("cappy roll jump");
		fighter figh2 = new fighter("blj", 110);
		striker figh3 = new striker("mario stikers charged");
		striker figh4 = new striker("baloney macaroni");//we can assign a fighter to a striker cause a striker is a fighter
		figh1.attack(figh2);
		figh1.attack(figh2);
		figh1.attack(figh2);
		figh1.sleepy();
		figh2.iDontFeelSoGood();
		figh1.attack(figh2);
		figh1.attack(figh2);
		figh1.attack(figh2);
		figh1.sleepy();
		figh2.iDontFeelSoGood();
		//figh2.health = 100; impossible cause health is now private
		//private is a visiblity modifyer, no variable should ever be directly exposed like this
		figh2.rest();
		figh2.rest();
		figh1.attack(figh2);
		figh1.attack(figh2);
		figh1.attack(figh2);
		figh1.sleepy();
		figh2.iDontFeelSoGood();

		figh3.punch(figh2);
		figh3.kick(figh2);
		figh2.iDontFeelSoGood();



		System.out.println("theres " + fighter.fighterCount+ " fighters");

	}
}