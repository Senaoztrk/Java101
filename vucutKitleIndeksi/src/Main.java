import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;


        Scanner inp=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden girin: ");
        boy=inp.nextDouble();
        System.out.print("Kilonuzu girin: ");
        kilo=inp.nextDouble();


        double indeks=kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz: "+indeks);;



    }
}