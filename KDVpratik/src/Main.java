//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double para;
        double kdvOran=0.18;
        Scanner inp= new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        para=inp.nextDouble();
        double kdvHesap= para*kdvOran;
        double kdvliFiyat=para+kdvHesap;
        System.out.println("KDV oranı: "+kdvHesap);
        System.out.println("KDVli fiyat: "+kdvliFiyat);

        if(para<1000)
        {
            System.out.println("KDV Oranı 0.18'dir= "+kdvliFiyat);

        }
        else
        {
            kdvOran=0.08;
            System.out.println("KDV Oranı 0.08'dir= "+kdvliFiyat);

        }




    }
}