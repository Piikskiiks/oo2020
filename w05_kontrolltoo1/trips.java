import java.util.*;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
public class trips{

    static ArrayList<Integer> mangijaPositsioonid = new ArrayList<Integer>();
    static ArrayList<Integer> mangija2Positsioonid = new ArrayList<Integer>();
    public static void main(String[] args){ // teen manguvalja

        char[][] gameBoard= {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
        
        
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sisesta enda valik:(1-9)");
            int asukoht = scan.nextInt();
            while(mangijaPositsioonid.contains(asukoht) || mangija2Positsioonid.contains(mangijaPositsioonid)){
                System.out.println("Positsioon on v6etud!Vali 6ige positsioon!");
                asukoht = scan.nextInt();
            }

            valiAsukoht(gameBoard, asukoht, "mangija");
            String tulemus = kontrolliVoitja();
            if(tulemus.length()>0){
                System.out.println(tulemus);
                break;
            }
            
            Random rand = new Random();
            int mangija2Asukoht = rand.nextInt(9);
            while(mangijaPositsioonid.contains(mangija2Asukoht) || mangija2Positsioonid.contains(mangija2Asukoht)){
                
                mangija2Asukoht = rand.nextInt(9);
            }
            valiAsukoht(gameBoard, mangija2Asukoht, "mangija2");

            printGameBoard(gameBoard);

            tulemus = kontrolliVoitja();
            if(tulemus.length()>0){
                System.out.println(tulemus);
                break;
            }
            System.out.println(tulemus);



        }
       

    }

    public static void printGameBoard(char [][] gameBoard){
        for(char[] row : gameBoard){ //for each row inside of gameboard,iga rea jaoks prindib symboli
            for(char c : row){ //iga charactersingle digit reas
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void valiAsukoht(char[][] gameBoard, int asukoht, String kasutaja){
        char symbol = ' ';
        if(kasutaja.equals("mangija")){
            symbol = 'X';
            mangijaPositsioonid.add(asukoht);
        } else if(kasutaja.equals("mangija2")){
            symbol= 'O';
            mangija2Positsioonid.add(asukoht);
        }

        switch(asukoht){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;

        }

      

    }
    
    public static String kontrolliVoitja(){
        List ulemineRida = Arrays.asList(1, 2, 3);
        List keskmineRida = Arrays.asList(4, 5, 6);
        List alumineRida = Arrays.asList(7, 8, 9);
        List vasakVeerg = Arrays.asList(1, 4, 7);
        List keskmineVeerg = Arrays.asList(2, 5, 8);
        List paremVeerg = Arrays.asList(3, 6, 9);
        List ristumine1 = Arrays.asList(1, 5, 9);
        List ristumine2 = Arrays.asList(7, 5, 3);
        
        List<List> voit = new ArrayList<List>();
        voit.add(ulemineRida);
        voit.add(keskmineRida);
        voit.add(alumineRida);
        voit.add(vasakVeerg);
        voit.add(keskmineVeerg);
        voit.add(paremVeerg);
        voit.add(ristumine1);
        voit.add(ristumine2);

        for(List l : voit){
            if(mangijaPositsioonid.containsAll(l)){
                return "Oled v6itnud mangu!Palju 6nne!";

            } else if(mangija2Positsioonid.containsAll(l)){
                return " Mangija 2 voitis!";
            } else if (mangijaPositsioonid.size()+ mangija2Positsioonid.size()==9){
                return "Viik!";

            }

        }

        return "";

    }
}