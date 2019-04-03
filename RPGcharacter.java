
public class RPGcharacter {
	public static void main(String[] args){

		int s1= 2;
		int s2= 2;




		Character s[]= new Character[s1];

		s[0]= new Magician("さくら","滅びろ");
		s[1]= new Knight("しょうた","ファイヤーエンブレム");


		Character ss[]= new Character[s2];

		ss[0]= new Healer("みかん","強烈な睡魔の呪文");
		ss[1]= new Sages("サラマ","神の御言葉");


		for(int i=0; i<s1; i++);{
			s[i].introduce();
			s[i].attack(ss[s2]);
		}

		for(int i=0; i<s2; i++);{
			ss[i].introduce();
			ss[i].attack(s[s1]);
		}

	}

}