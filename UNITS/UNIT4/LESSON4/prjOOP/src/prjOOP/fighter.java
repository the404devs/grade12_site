package prjOOP;

public class fighter {
	/*first thing you do is think of the identity
	then the properties/state ->
	 determine all the features/variables that make up the state of the object*/	
	int health = 0;
	double mass = 0;
	int stamina = 0;
	String name = null;
	int reach = 0;
	Boolean ko = false;
	double tough = 0;
	static int fighterCount = 0;

	/*how to make a constructor
	these determine how we create the fighter*/
	fighter(String identity){
		this.name = identity;
		this.health = 85;
		this.stamina = 67;
		this.mass = 94;
		this.reach = 65;
		this.ko = false;
		this.tough = 0.75;
		fighter.fighterCount++;
	}
	fighter(String identity, double mass){
		this.name = identity;
		this.health = 85;
		this.stamina = 67;
		this.mass = mass;
		this.reach = 65;
		this.ko = false;
		this.tough = 0.75;
		fighter.fighterCount++;
	}

	/*implement the behaviors of the fighters*/
	void attack(fighter target){
		System.out.println("grunt");
		this.reduceStamina();
		target.health-=5;
	}
	/*this function is private cause only the class needs to access it*/
	private void reduceStamina(){
		this.stamina--;
	}
	/*the following function is an example of an overloaded function. overloaded functions have the same name but diff. parameters
	the parameter type is important, not the number of them*/
	private void reduceStamina(int amount){
		this.stamina-=amount;
	}

	void sleepy(){
		System.out.println("stamina is "+this.stamina);
	}

	void iDontFeelSoGood() {
		System.out.println("my health is " +this.health);
	}

	void rest(){
		this.health += 2;
	}

	void move(){

	}

	void defend(){

	}

	void taunt(){

	}

	void spam(){

	}
}