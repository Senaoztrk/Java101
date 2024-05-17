//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int boyut;
        System.out.print("Boyut: ");
        boyut=inp.nextInt();



        for(int i=1;i<boyut;i++)
        {
            for(int k=1;k<=(boyut-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=boyut; i>=1;i--)
        {
            for(int k=boyut-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=(2*i)-1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}