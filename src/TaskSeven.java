import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskSeven {

    static boolean numberIsSqare(int a){
        int score = (int) Math.sqrt(a);
        if (score * score == a){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();

        if (numberIsSqare(a)){
            System.out.println("Podana liczba jest kwadratem pewnej liczby całkowitej");
        }else {
            System.out.println("Podana liczba nie jest kwadratem pewnej liczby całkowitej");
        }
    }
}
