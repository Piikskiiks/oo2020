public class arvutus1{
    public static void main(String[] arg){
        int arv=Integer.parseInt(arg[0]);
        System.out.println(arv*2);
        for(int i=0; i<arv; i++){
            System.out.println(i+" . tere");
            //kuvage reanumbrile vastav arv tarne
	    for(int tnr=0; tnr<i; tnr++){
		System.out.print("*");
	    }
            System.out.println(" "+i+" .tere");	
	}

    }

}