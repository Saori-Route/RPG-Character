
class Healer extends Character {

	public Healer() {

	}

	public int hp;
	public int mp;
	public String heal;
	public String name;
	public int clash;


	public void introduce(){
		System.out.println("私の名前は"+name+"よ！"+"職業はヒーラー！！");
	}

	public Healer(String name,String heal) {

		this.name=name;
		this.heal=heal;

	}

	public void attack() {
		heal();
	}

	public void heal() {
		System.out.println(this.name+"の"+this.heal);
	}



}
