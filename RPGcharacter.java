
public class RPGcharacter {
	public static void main(String[] args){
		Character a;
		a = new Character();

		a.hp = 80;
		a.mp = 70;
		a.clash = 30;
		a.name ="さくら";


		Character z;
		z = new Character();

		z.hp = 65;
		z.mp = 90;
		z.clash = 35;
		z.name ="みかん";

		a.introduce();
		z.introduce();

		Character a1 = new Character("さくら",35,80);

		Character z1 = new Character("みかん",30,65);


		a1.attack(z1);
			System.out.println("きゃああああああああああああああああああああ");

		z1.attack(a1);{
			System.out.println("まだまだああああああああああああああああああ");
		}

	}


}
