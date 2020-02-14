import java.util.Scanner;

public class Ruutvorrand1 {
    
    public static double[] arvuta(double a, double b, double c){
    
    double discriminant = b * b - 4 * a * c;
    double root1=0, root2=0;
    if(discriminant < 0){
        System.out.println("Võrrandil pole reaalarvulisi lahendeid.");
    }

    if(discriminant == 0){
        System.out.println("Võrrandil on kaks kokkulangevat reaalarvulist lahendit");
            
        root1 = -b / (2*a);
        root2 = -b/ (2*a);
    }
    if(discriminant > 0){
        System.out.println("Võrrandil on kaks erinevat reaalarvulist lahendit");

        root1= (-b + Math.sqrt(discriminant)) / (2 * a);
        root2= (-b - Math.sqrt(discriminant)) / (2 * a);
    }
     return new double[]{root1, root2};
    }       

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta A väärtus: ");
        double a = scanner.nextDouble();
        System.out.print("Sisesta B väärtus: ");
        double b = scanner.nextDouble();
        System.out.print("Sisesta C väärtus: ");
        double c = scanner.nextDouble();
        double[] v=arvuta(a, b, c);
        double root1 = v[0];
        double root2 = v[1];
        System.out.println("Ruutvõrrandi vastused on: "); 
        System.out.println("X1 vastus on:" + root1);
        System.out.println("X2 vastus on:" + root2);


    }


}