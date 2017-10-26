import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskEight {

    static int checkNumberOfDivisors(int a){
        int counter = 0;
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                counter++;
            }
        }
        return counter;
    }

    static boolean numberIsPrime(int a){
        if (checkNumberOfDivisors(a) == 2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int a = scanner.nextInt();
        System.out.println("Liczba dzielników podanej liczby to "+checkNumberOfDivisors(a));
        if (numberIsPrime(a)){
            System.out.println("Liczba jest liczbą pierwszą");
        }else {
            System.out.println("Liczba nie jest liczbą pierwszą");
        }
    }
}
