
class Magician extends Character {

	public Magician(){

	}

	public int hp;
	public int mp;
	public String spell;
	public String name;
	public int clash;



	public void introduce(){
		System.out.println("私の名前は"+name+"！"+"マジシャンだよ！！");
	}


	public Magician(String name,String spell){


		this.name= name;
		this.spell=spell;

	}

	public void attack(Character target) {
		magic();
	}

	public void magic(){
		System.out.println(this.name+"の魔法攻撃！！"+this.spell+"！！");
	}


}
