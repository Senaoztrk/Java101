//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int sayi;
        Scanner inp=new Scanner(System.in);

        System.out.print("Sayı girin: ");
        sayi=inp.nextInt();

        int sum=0;
        int adet=0;
        for(int i=1;i<=sayi;i++)
        {

            if(i%3==0 && i%4==0)
            {
                sum+=i;
                adet++;

            }
        }

        double ortalama=sum/adet;
        System.out.print(ortalama);
    }
}