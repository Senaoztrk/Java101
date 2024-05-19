//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int bas;
        System.out.print("Basamak sayısı girin: ");
        bas= inp.nextInt();

        for(int i=bas;i>1;i--)
        {

            for(int j=i;j>1;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}