
public class RPGcharacter {
	public static void main(String[] args){

	     int k1 = 2;

	     Character[]k = new Character[k1];

	     k[0]= new Knight();
	     k[1]= new Magician();

	     for(int i =0; i< k1; i++){

	    	 k[i].ksb();
	     }


	}

}