import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskFive {

    static boolean isPythagorean(int a, int b, int c){
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbę c:");
        int c = scanner.nextInt();

        if (isPythagorean(a, b, c)){
            System.out.println("Podane liczby są liczbami Pitagorejskimi");
        }else {
            System.out.println("Podane liczby nie są liczbami Pitagorejskimi");
        }
    }
}
