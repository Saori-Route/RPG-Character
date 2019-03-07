
public class Character {
	public int hp;
	public int mp;
	public String name;

	public void introduce(){
		System.out.println("私の名前は"+name+"だよ！！"+"体力は"+hp+"で、"+"魔力は"+mp+"だよ！よろしくね！！");

	}


	public void attack(){
		System.out.println(name+"への攻撃！！"+name+"に30のダメージ！！");


	}

}
