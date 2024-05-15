import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
        System.out.print("a kenarı: ");
        int a=inp.nextInt();
        System.out.print("b kenarı: ");
        int b=inp.nextInt();
        double hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+hipotenus);

        double u=(a+b+hipotenus)/2;
        double cevre=2*u;
        double alan= Math.sqrt((u * (u-a)* (u-b) * (u-hipotenus)));
        System.out.print("Üçgenin Alanı: "+alan);3

    }

}