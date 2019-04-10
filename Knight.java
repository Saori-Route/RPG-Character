
class Knight extends Character {
	private String sword;

	public Knight() {
		this.sword = "ファイヤーエンブレム";

	}


	public void introduce(){
		System.out.println("俺の名前は"+name+"！！"+"ナイトだ！");

	}


	public Knight(String name,String swrod) {
		super(name,80,70);
		this.sword= swrod;

	}

	public void attack(Character target) {
		sword();
		target.damage(clash);
	}

	public void sword() {
		System.out.println(this.name+"の攻撃"+this.sword+"！！");
	}
	
	@Override
	public void attack() {
		sword();
	}

}
