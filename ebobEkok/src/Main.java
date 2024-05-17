//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int sayi1 = inp.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = inp.nextInt();

       int i=1;
        while(i<=sayi1)
        {
            if(sayi1%i==0 && sayi2%i==0)
            {
                System.out.println(i);


            }
            i++;


        }

        int k=1;
        while(k<=sayi2*sayi1)
        {
            if(k%sayi1==0 && k%sayi2==0)
            {
                System.out.println(k);


            }
            k++;
        }
    }
}