
 public class Character implements Movable,Ksb,Wa,Letter{
	public Character(){

	}

	public int hp;
	public int mp;
	public String name;
	public int clash;

	public void introduce(){
		System.out.println("私の名前は"+name+"だよ！！"+"体力は"+hp+"で、"+"魔力は"+mp+"だよ！よろしくね！！");

	}


	public Character(String name,int clash,int hp){


		this.name= name;
		this.hp = hp;
		this.clash = clash;


	}

	public void attack(Character target){
		System.out.println(this.name+"の攻撃！！");
		target.damage(clash);
	}


	public void damage(int clash){
		hp-=clash;
		System.out.println(this.name+"は攻撃を受けた！！"+clash+"のダメージ！!"+"HPは"+this.hp+"になった！");

	}


    @Override
	public void ksb(Character [] target) {
    	System.out.println(this.name+"はジャンプした");

    }

    @Override
    public void move(Character [] target) {
    	System.out.println(this.name+"は歩いた");
    }

    @Override
    public void warau(Character [] target) {

    }

    @Override
    public void letter(Character[] target) {

    }
}

