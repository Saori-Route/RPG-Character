
public class Character {

	public Character(){

	}

	public int hp;
	public int hp2;
	public int hp3;
	public int mp;
	public String name;

	public void introduce(){
		System.out.println("私の名前は"+name+"だよ！！"+"体力は"+hp+"で、"+"魔力は"+mp+"だよ！よろしくね！！");

	}


	public Character(String name,int hp2,int hp3){


		this.name= name;
		this.hp2 = hp2;
		this.hp3 = hp3;

	}
		public void attack() {
			System.out.println(this.name+"の攻撃！！");
		}


	    public void damage(){
		    System.out.println(this.name+"は攻撃を受けた！！HPに"+this.hp2+"のダメージ！"+"HPは"+this.hp3+"になった！");

	}

	}
