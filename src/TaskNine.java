import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskNine {

    static boolean numberIsCube(int a){
        int score = (int) Math.cbrt(a);
        if (score * score * score == a){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        if (numberIsCube(a)){
            System.out.println("Liczba jest sześcianem pewnej cyfry");
        }else {
            System.out.println("Liczba nie jest sześcianem pewnej cyfry");
        }
    }
}
