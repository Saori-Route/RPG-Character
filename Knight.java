
class Knight extends Character implements Movable,Ksb {
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
    @Override
	public void attack(Character target) {
		sword();
		target.damage(clash);
	}

	public void sword() {
		System.out.println(this.name+"の攻撃"+this.sword+"！！");

	}

	@Override
	public void damage(int clash){
		hp-=clash;
		System.out.println(this.name+"は攻撃を受けた！！"+clash+"のダメージ！!"+"HPは"+this.hp+"になった！");
	}


	@Override
	public void ksb(){
		System.out.println(this.name+"はジャンプした");
	}


}
