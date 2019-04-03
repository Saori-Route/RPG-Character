
class Healer extends Character {
	private String heal;

	public Healer() {

	}

	public void introduce(){
		System.out.println("私の名前は"+name+"よ！"+"職業はヒーラー！！");
	}

	public Healer(String name,String heal) {
		super(name,80,30);
		this.heal = heal;


	}

	public void attack(Character target) {
		heal();
		target.damage(clash);
	}

	public void heal() {
		System.out.println(this.name+"の"+this.heal);
	}



}
