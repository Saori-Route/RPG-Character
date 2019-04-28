
class Healer extends Character implements Wa{
	private String heal;

	public Healer() {
		this.heal = "強烈な睡魔の呪文";

	}

	public void introduce(){
		System.out.println("私の名前は"+name+"よ！"+"職業はヒーラー！！");
	}

	public Healer(String name,String heal) {
		super(name,80,30);
		this.heal = heal;


	}
    @Override
	public void attack(Character target) {
		heal();
		target.damage(clash);
	}

	public void heal() {
		System.out.println(this.name+"の"+this.heal);
	}

	@Override
    public void attack(){
		heal();
	}

	@Override
	public void warau(Character [] target) {
		System.out.println(this.name+"は笑った");
	}

}
