import java.util.Scanner;

public class Ruutvorrand { //loome klassi ruutvõrrand
    public static void main(String[] args){ //void define return type,pole vaja teha uut objekti,public pääseme ligi igalt poolt,static ligipääsu muutja ehk võime kutsuda esile otse kasutades classi nime.
        Scanner scanner = new Scanner(System.in); //skaneerib mida sisestasin nt kas integer v string.

        System.out.print("Sisesta A väärtus: ");
        double a = scanner.nextDouble();
        System.out.print("Sisesta B väärtus: ");
        double b = scanner.nextDouble();
        System.out.print("Sisesta C väärtus: ");
        double c = scanner.nextDouble();

        double root1 = 0; //detsimaalarvu jaoks kasutan double nagu float pythonis.
        double root2 = 0;

        double discriminant = b * b - 4 * a * c;

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

       System.out.println("Ruutvõrrandi vastused on: "); 
       System.out.println("X1 vastus on:" + root1);
       System.out.println("X2 vastus on:" + root2);

    }

}