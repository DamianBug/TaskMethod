import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskThirteen {

    static int numberOfNWD(int a, int b){
        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();

        System.out.println("NWD dwóch liczb to: "+numberOfNWD(a, b));
    }
}
