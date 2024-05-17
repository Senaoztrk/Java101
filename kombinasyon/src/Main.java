//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.print("n sayısını gir: ");;
        int n=inp.nextInt();
        System.out.print("r sayısını gir: ");;
        int r=inp.nextInt();

        int fak=1;
        for(int i=0;i<=r;i++)
        {
            fak*=(n-i);
            fak/=(i+1);
        }

        System.out.print(fak);
    }
}