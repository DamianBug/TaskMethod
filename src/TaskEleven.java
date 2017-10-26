import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskEleven {

    static int numberOfDivisors(int a){
        int counter = 0;
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();

        System.out.println("Liczba dzielników: "+numberOfDivisors(a));
    }
}
