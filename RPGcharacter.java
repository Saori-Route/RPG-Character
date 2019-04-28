
public class RPGcharacter {
	public static void main(String[] args){


        int s1=2;
		int s2=2;


		Character s[]= new Character[s1];

		s[0]= new Knight("しょうた","ファイヤーエンブレム");
		s[1]= new Magician("さくら","滅びろ");

		Character ss[]= new Character[s2];

		ss[0]= new Healer("みかん","強烈な睡魔の呪文");
		ss[1]= new Sages("サラマ","神の御言葉");

		for(int i=0; i<s1; i++) {
			((Ksb)s[i]).ksb(ss);

		}

		for(int j=0; j<s2; j++) {


		    ((Wa)ss[j]).warau(s);
		    ((Letter)ss[j]).letter(s);
            ((Movable)ss[j]).move(s);

		}



	}

}