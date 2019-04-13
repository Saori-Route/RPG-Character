
class Magician extends Character implements Ksb {
	private String spell;

	public Magician(){
		this.spell ="滅びろ";

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
		target.damage(clash);
	}

	public void magic(){
		System.out.println(this.name+"の魔法攻撃！！"+this.spell+"！！");
	}

	@Override
	public void attack(){
		magic();
	}

	@Override
	public void ksb() {
		System.out.println(this.name+"もジャンプした！！");
	}

}