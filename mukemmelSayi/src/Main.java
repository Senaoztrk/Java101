//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int num;
        System.out.print("Sayı girin: ");
        num=inp.nextInt();
        int sum=0;

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;


            }
        }
        if(sum==num)
        {
            System.out.print(num+" mükemmel sayıdır.");
        }
        else {

            System.out.print(num+" mükemmel sayı değildir.");

        }
    }
}