//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int n;
        System.out.print("n: ");
        n= inp.nextInt();
        double toplam=0;

        for(double i=1;i<=n;i++)
        {
            toplam+=1/i;
        }

        System.out.print(toplam);
    }
}