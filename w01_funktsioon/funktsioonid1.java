import java.util.*;

public class funktsioonid1{
	public static  boolean kasJagub(int mis,int millega){
		return mis % millega==0;
	}
	//bollean on kas jah voi ei vastus
	public static double geomeetrilineKeskmine(double arv1, double arv2){
		return Math.sqrt(arv1*arv2);
	}
	public static int korrutaKahega(int arv){
		return arv*2;
	}
	public static boolean kasAlgarv(int arv){
		for(int jagaja=2; jagaja<arv; jagaja++){
			if(arv % jagaja == 0){return false;}

		}
		return true;
	}
	public static void trykiJagajad(int arv){
		int jagaja=2;
		while (arv!=1){
			
			if (arv % jagaja ==0){
				System.out.println(jagaja);
				arv=arv/jagaja;
				jagaja=2;
			} else {jagaja++;}
		}
	} //kui void siis prindib ekraanile
	public static ArrayList<Integer> jagajateLoetelu(int arv){
		ArrayList<Integer> vastus=new ArrayList<Integer>();
		int jagaja=2;
		while(arv!=1){
			if (arv% jagaja==0){
				vastus.add(jagaja);
				arv=arv/jagaja;
				jagaja=2;
			}else {jagaja++;}

		}
		return vastus;
	
	}
	public static ArrayList<Integer> yhisedJagajad(int arv1, int arv2){
		ArrayList<Integer> jagajad1=jagajateLoetelu(arv1);
		ArrayList<Integer> jagajad2=jagajateLoetelu(arv2);
		ArrayList<Integer> vastus=new ArrayList<Integer>();
		for (int arv: jagajad1){
			if (jagajad2.contains(arv)){
				vastus.add(arv);
				jagajad2.remove(new Integer(arv));
			}
		}
		return vastus;
	}
	//Koosta funktsioon tagastamaks ArrayListis olevate arvude korrutise
	public static int syt(int arv1, int arv2){
		return arvudeKorrutis(yhisedJagajad(arv1, arv2));
	}
	//Koosta funktsioon kahe arvu suurima uhisteguri leidmiseks kasutades eelnevaid
	public static int arvudeKorrutis( ArrayList<Integer> tegurid){
		int puhver=1;

		for (int arv: tegurid){
			puhver=puhver* arv;
		}
		return puhver;
	}
	public static void main(String[] arg){
			System.out.println(syt(60, 48));
			System.out.println(yhisedJagajad(60, 48));
			System.out.println(jagajateLoetelu(60));
			trykiJagajad(60);
			System.out.println(kasAlgarv(10));
			System.out.println(kasJagub(6, 3));
			System.out.println(korrutaKahega(7));
			System.out.println(geomeetrilineKeskmine(4, 9));

	}

}