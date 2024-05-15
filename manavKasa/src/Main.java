import java.util.Scanner;

public class Main {
0    public static void main(String[] args) {
        double armut,elma,domates,muz,patlıcan;

        Scanner inp=new Scanner(System.in);
        System.out.print("Armut kaç kg: ");
        armut=inp.nextDouble();
        System.out.print("Elma kaç kg: ");
        elma=inp.nextDouble();
        System.out.print("Domates kaç kg: ");
        domates=inp.nextDouble();
        System.out.print("Muz kaç kg: ");
        muz=inp.nextDouble();
        System.out.print("Patlıcan kaç kg: ");
        patlıcan=inp.nextDouble();
        double toplamTutar=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.00*patlıcan);
        System.out.print("Toplam tutar:  TL"+toplamTutar);
    }

}