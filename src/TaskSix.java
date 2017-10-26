import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskSix {

    static int sumOfNumber(int a){
        int sum = 0;
        while (a != 0){
            sum = sum + a%10;
            a = a/10;
        }
        return sum;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();

        System.out.println("Suma cyfr zadanej liczby to "+sumOfNumber(a));
    }
}
