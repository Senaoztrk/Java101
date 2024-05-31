
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = inp.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (list[i] < sayi && list[i] > min) {
                min = list[i];
            }


        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] > sayi && list[i] < max) {
                max = list[i];
            }

        }

        System.out.println(min);
        System.out.println(max);

    }


}