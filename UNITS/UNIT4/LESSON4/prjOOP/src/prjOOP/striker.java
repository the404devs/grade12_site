package prjOOP;

public class striker extends fighter {

	striker(String id){
		/*super means calling one of the parent constructors so all the inherited state variables are initialized.*/
		super(id);
	}

	void punch(fighter target){
		System.out.println("bing bing wahoo");
		this.stamina-=1;
		target.health-=15;
	}
	void kick(fighter target){
		System.out.println("bing bing wahoo");
		this.stamina-=5;
		target.health-=15;

	}
	void attack(fighter target){//this is an overridden function (same signature of the parent methodZ)
		super.attack(target);//attack like normal
		System.out.println("double whammy");
		target.toughness/=2.0;//and then we reduce their toughness
	}
}