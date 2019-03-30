
class Magician extends Character {
	private String spell;

	public Magician(){

	}



	public void introduce(){
		System.out.println("私の名前は"+name+"！"+"マジシャンだよ！！");
	}


	public Magician(String name,String spell){
		super(name,50,50);
		this.spell = spell;



	}

	public void attack(Character target) {
		magic();
	}

	public void magic(){
		System.out.println(this.name+"の魔法攻撃！！"+this.spell+"！！");
	}

}