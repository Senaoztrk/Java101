//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = inp.nextInt();

        System.out.println("4 ve 5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i++) {
            int kuvvet4 = 1;
            int kuvvet5 = 1;

            for (int j = 0; j < i; j++) {
                kuvvet4 *= 4;
                kuvvet5 *= 5;
            }

            System.out.println("4^" + i + " = " + kuvvet4);
            System.out.println("5^" + i + " = " + kuvvet5);
        }
    }
}