//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int dogum;
        System.out.print("Doğum yılını girin: ");
        dogum=inp.nextInt();

        if(dogum%12==0)
        {
            System.out.print("Maymun");
        }
        else if(dogum%12==1) {
            System.out.print("Horoz");
        }
        else if(dogum%12==2)
        {
            System.out.print("Köpek");
        }
        else if(dogum%12==3)
        {
            System.out.print("Domuz");
        }
        else if(dogum%12==4)
        {
            System.out.print("Fare");
        }
        else if(dogum%12==5)
        {
            System.out.print("Öküz");
        }
        else if(dogum%12==6)
        {
            System.out.print("Kaplan");
        }
        else if(dogum%12==7)
        {
            System.out.print("Tavşan");
        }
        else if(dogum%12==8)
        {
            System.out.print("Ejderha");
        }
        else if(dogum%12==9)
        {
            System.out.print("Yılan");
        }
        else if(dogum%12==10)
        {
            System.out.print("At");
        }
        else if(dogum%12==11)
        {
            System.out.print("Koyun");
        }

    }
}