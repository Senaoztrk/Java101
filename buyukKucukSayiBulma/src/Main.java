//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int N,sayi;
        System.out.print("Kaç tane sayı girmek istersiniz: ");
        N=inp.nextInt();
        int max,min;
        System.out.print("Sayı giriniz: ");
        sayi= inp.nextInt();
        min=max=sayi;

        for(int i=2;i<=N;i++)
        {
            System.out.print("Sayı giriniz: ");
            sayi= inp.nextInt();
            if(sayi<min)
            {
                min=sayi;
            }
            if(sayi>max)
            {
                max=sayi;
            }


        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}