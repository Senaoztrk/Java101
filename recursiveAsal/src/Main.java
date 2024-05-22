//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    static boolean asal(int sayi,int bolen)
    {
        if(sayi<2)
        {
            return false;
        }
        if(sayi%bolen==0)
        {
            return false;
        }
        if(bolen==1)
        {
            return true;
        }
        if(bolen*bolen>sayi)
        {
            return true;
        }

        return asal(sayi, bolen+1);


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        if (sayi < 2)
            System.out.println("Asal değil.");
        else if (asal(sayi, 2))
            System.out.println("Asal.");
        else
            System.out.println("Asal değil.");

    }
}