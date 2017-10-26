import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskThree {

    static int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();

        System.out.println("Iloczyn dwóch liczb to "+multiply(a, b));

    }
}
