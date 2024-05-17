//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int us;
        int taban;
        System.out.print("Taban: ");
        taban=inp.nextInt();
        System.out.print("Üs: ");
        us=inp.nextInt();
        int sonuc=1;

        for(int i=1;i<=us;i++)
        {
            sonuc*=taban;

        }
        System.out.print("Sonuç: "+sonuc);
    }
}