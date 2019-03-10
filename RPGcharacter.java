
public class RPGcharacter {
	public static void main(String[] args){
		Character a;
		a = new Character();

		a.hp = 80;
		a.mp = 70;
		a.name ="さくら";


		Character z;
		z = new Character();

		z.hp = 65;
		z.mp = 90;
		z.name ="みかん";

		a.introduce();
		z.introduce();

		Character a1 = new Character("さくら",50,
				30);
		Character z1 = new Character("みかん",35,30);


		a1.attack();{
			z1.damage();
		}
		z1.attack();{
			a1.damage();
		}

	}


}
