public class arvutus2{
	public static void main(String[] arg){
		int arv=Integer.parseInt(arg[0]);
		int arv2=Integer.parseInt(arg[1]);
		//koosta etteantud suuruses korrutustabel ja veel
		for(int i=0; i<=arv; i++){
			for(int j=1; j<=arv2; j++){
				int v=i*j;
				if(v<10){System.out.print(" ");}
				System.out.print("" +v);
			}
			if(i<10){System.out.print(" ");}
			System.out.println(i+" . tere");
			
		}
	}
}	