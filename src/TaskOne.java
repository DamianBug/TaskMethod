import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskOne {

    static int add(int a, int b){
        return a + b;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();

        System.out.println("Suma dwóch liczb to "+add(a, b));
    }
}
