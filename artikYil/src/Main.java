//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int yil;

        System.out.print("Yıl girin: ");
        yil=inp.nextInt();

        if(yil%4==0)
        {
            if(yil%100==0)
            {
                if(yil%400==0)
                {
                    System.out.print("Artık yıldır.");
                }
                else
                {
                    System.out.print("Artık yıl değildir.");

                }
            }
            else
            {
                System.out.print("Artık yıldır.");
            }
        }
        else {
            System.out.print("Artık yıl değildir.");
        }
    }
}