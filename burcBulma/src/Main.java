//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int ay,gun;
        Scanner inp= new Scanner(System.in);

        System.out.print("Ayı sayı cinsinden girin: ");
        ay=inp.nextInt();
        System.out.print("Günü sayı cinsinden girin: ");
        gun=inp.nextInt();

        if((ay==1))
        {
            if((gun<=21))
            {
                System.out.print("Oğlak burcu");
            }
            else
            {
                System.out.print("Kova burcu");
            }
        }
        else if((ay==2))
        {
            if((gun<=19))
            {
                System.out.print("Kova burcu");
            }
            else
            {
                System.out.print("Balık burcu");
            }
        }
        else if((ay==3))
        {
            if((gun<=20))
            {
                System.out.print("Balık burcu");
            }
            else
            {
                System.out.print("Koç burcu");
            }
        }
        else if((ay==4))
        {
            if((gun<=20))
            {
                System.out.print("Koç burcu");
            }
            else
            {
                System.out.print("Boğa burcu");
            }
        }
        else if((ay==5))
        {
            if((gun<=19))
            {
                System.out.print("Boğa burcu");
            }
            else
            {
                System.out.print("İkizler burcu");
            }
        }
        else if((ay==6))
        {
            if((gun<=22))
            {
                System.out.print("İkizler burcu");
            }
            else
            {
                System.out.print("Yengeç burcu");
            }
        }
        else if((ay==7))
        {
            if((gun<=22))
            {
                System.out.print("Yengeç burcu");
            }
            else
            {
                System.out.print("Aslan burcu");
            }
        }
        else if((ay==8))
        {
            if((gun<=22))
            {
                System.out.print("Aslan burcu");
            }
            else
            {
                System.out.print("Başak burcu");
            }
        }
        else if((ay==9))
        {
            if((gun<=22))
            {
                System.out.print("Başak burcu");
            }
            else
            {
                System.out.print("Terazi burcu");
            }
        }
        else if((ay==10))
        {
            if((gun<=22))
            {
                System.out.print("Terazi burcu");
            }
            else
            {
                System.out.print("Akrep burcu");
            }
        }
        else if((ay==11))
        {
            if((gun<=21))
            {
                System.out.print("Akrep burcu");
            }
            else
            {
                System.out.print("Yay burcu");
            }
        }
        else
        {
            System.out.print("Yay burcu");
        }

    }
}