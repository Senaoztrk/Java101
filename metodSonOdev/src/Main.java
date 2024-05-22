//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {

    static void islem(int n) {

        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        islem(n - 5);

        System.out.print(n + " ");
    }

    public static void main(String[] args)
    {

        islem(16);

    }
}