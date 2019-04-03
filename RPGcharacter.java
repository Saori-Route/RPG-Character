
public class RPGcharacter {
	public static void main(String[] args){

		Magician a;
		a = new Magician("さくら","滅びろ");

		a.hp = 80;
		a.mp = 70;
		a.clash = 20;
		a.name ="さくら";

		Healer z;
		z = new Healer("みかん","強烈な睡魔の呪文");

		z.hp = 65;
		z.mp = 90;
		z.clash = 30;
		z.name ="みかん";

		a.introduce();
		z.introduce();
		a.attack(z);
		z.attack(a);
	}
}