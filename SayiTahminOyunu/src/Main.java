//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random rand=new Random();
        int number=rand.nextInt(100);

        //int num=(int)(Math.random()*100);
        //System.out.println(num);

        Scanner inp=new Scanner(System.in);
        int right=0;
        int selected;
        int wrong[]=new int[5];
        boolean isWin=false;
        System.out.println(number);

        while(right<5) {
            System.out.print("Tahmin ettiğiniz sayıyı girin: ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir sayı girin!");
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler doğru tahmin!");
                isWin = true;
                break;
            } else {


                System.out.println("Hatalı sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayısı seçilen sayıdan büyük!");
                } else {
                    System.out.println(selected + " sayısı seçilen sayıdan küçük!");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));

            }
        }

        if(!isWin)
        {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));


        }







    }
}