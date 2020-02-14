import java.util.*;
public class loetelu1{
	public static void main(String[] arg){
		ArrayList<Integer> arvud=new ArrayList<Integer>();
		arvud.add(2);
		arvud.add(3);
		System.out.println(arvud);	
		System.out.println(arvud.get(0));
		System.out.println(arvud.size());
		arvud.remove(new Integer(3));
		System.out.println(arvud);
	}
	

}