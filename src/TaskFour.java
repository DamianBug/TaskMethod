import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by Damian on 25.10.2017.
 */
public class TaskFour {

    static boolean checkDivide(int a, int b){
        int action;
        if (a != 0 && b != 0){
            action = a / b;
            return true;
        }else {
            return false;
        }
    }

    static double divide(int a, int b){
        return (double)a / b;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b:");
        int b = scanner.nextInt();

        if (checkDivide(a, b)){
            System.out.print("Iloraz dwóch liczb to "+divide(a, b));
        }else {
            System.out.println("Podano niepoprawne dane");
        }
    }
}
