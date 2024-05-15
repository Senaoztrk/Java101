//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yaricap;

        Scanner inp=new Scanner(System.in);
        System.out.println("Yarıçapı girin: ");
        yaricap=inp.nextInt();

        double pi=3.14;
        double alan= pi*yaricap*yaricap;
        double cevre=2*pi*yaricap;

        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);


    }
}