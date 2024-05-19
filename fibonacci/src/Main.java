//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int num = inp.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                System.out.print(fib1 + " ");
            } else if (i == 2) {
                System.out.print(fib2 + " ");
            } else {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
                System.out.print(fib + " ");
            }
        }


    }
}