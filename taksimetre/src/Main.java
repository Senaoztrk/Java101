import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        Scanner inp= new Scanner(System.in);
        System.out.print("KM: ");
        km=inp.nextInt();
        double tutar=10+(2.2*km);

        tutar=(tutar<20)?20:tutar;
        System.out.print("Tutar: "+tutar);


    }
}