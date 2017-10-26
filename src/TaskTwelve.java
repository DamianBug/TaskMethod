import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskTwelve {

    static double numberPower(double a, double n){
        return Math.pow(a, n);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        double a = scanner.nextDouble();
        System.out.println("Podaj liczbę n");
        double n = scanner.nextDouble();
        System.out.println("Wynik potęgowania dwóch liczb: "+numberPower(a, n));
    }
}
