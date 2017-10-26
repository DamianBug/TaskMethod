import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskTen {

    static int numberOfMax(int a, int b){
        int max;
        if (a > b){
            max = a;
        }else {
            max = b;
        }
        return max;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();

        System.out.println("Maksimum z dwóch liczb to "+numberOfMax(a, b));
    }
}
