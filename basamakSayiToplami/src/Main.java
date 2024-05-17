//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int sayi;
        System.out.print("Sayı girin: ");
        sayi= inp.nextInt();
        int toplam=0;
        int tempsayi=sayi;

        while(tempsayi!=0)
        {
            int basamak=tempsayi%10; //son basamağı alır
            toplam+=basamak; //toplar
            tempsayi/=10; //son basamağı atar

        }
        System.out.print(toplam);

    }
}