
public class RPGcharacter {
	public static void main(String[] args){

		Magician a;
		a = new Magician();

		a.hp = 80;
		a.mp = 70;
		a.clash = 20;
		a.name ="さくら";

		Healer z;
		z = new Healer();

		z.hp = 65;
		z.mp = 90;
		z.clash = 30;
		z.name ="みかん";

		a.introduce();
		z.introduce();


		Character a1 = new Magician("さくら","滅びろ");

		Character z1 = new Healer("みかん","癒しの光");


		a1.magic();
		System.out.println("エンドレスファイアアアアアアアアアアアアア");

		z1.heal();
		System.out.println("ぽわわわああああああああああああああん");


	}


}
