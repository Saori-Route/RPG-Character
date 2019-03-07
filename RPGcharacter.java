
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

    	a.attack();
		z.attack();

	}


}
