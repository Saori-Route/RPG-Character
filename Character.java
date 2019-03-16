
public class Character {

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
		this.mp = mp;
		this.clash = clash;


	}

		public void attack(Character target) {
			System.out.println(this.name+"の攻撃！！");
			target.damage(clash);
		}


	    public void damage(int clash){
	    	hp-=clash;
		    System.out.println(this.name+"は攻撃を受けた！！"+this.clash+"のダメージ！!"+"HPは"+this.hp+"になった！");

	}

	}
