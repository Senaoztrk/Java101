//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int N=inp.nextInt();3

        if(N%2!=0)
        {
            System.out.print("Weird");
        }
        else
        {
            if((N>=2)&&(N<5))
            {
                System.out.print("Not Weird");

            }
            else if((N>=6)&&(N<20))
            {
                System.out.print("Weird");

            }
            else if(N>20)
            {
                System.out.print("Not Weird");
            }
        }
    }
}