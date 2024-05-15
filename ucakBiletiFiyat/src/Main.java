//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mesafe,yas,tip;
        Scanner inp=new Scanner(System.in);
        double km=0.10;
        double tutar;

        System.out.print("Yaş:" );
        yas=inp.nextInt();
        System.out.print("Km:" );
        mesafe=inp.nextInt();
        System.out.print("Yolculuk Tipi:" );
        tip=inp.nextInt();

        switch(tip)
        {
            case 1:
                if(yas<12)
                {
                    tutar=mesafe*km*0.50;
                    System.out.print(tutar);
                    break;
                }
                else if((yas>=12)&&(yas<=24))
                {
                    tutar=(mesafe*km)-(mesafe*km*0.1);
                    System.out.print(tutar);
                    break;

                }
                else if(yas>65)
                {
                    tutar=(mesafe*km)-(mesafe*km*0.3);
                    System.out.print(tutar);
                    break;
                }
                else
                {
                    tutar=mesafe*km;
                    System.out.print(tutar);
                    break;
                }
            case 2:
                if(yas<12)
                {
                    tutar=((mesafe*km*0.50)-(mesafe*km*0.5*0.2))*2;
                    System.out.print(tutar);
                    break;
                }
                else if((yas>=12)&&(yas<=24))
                {
                    tutar=(((mesafe*km)-(mesafe*km*0.1))-(((mesafe*km)-(mesafe*km*0.1))*0.2))*2;
                    System.out.print(tutar);
                    break;

                }
                else if(yas>65)
                {
                    tutar=(((mesafe*km)-(mesafe*km*0.3))-(((mesafe*km)-(mesafe*km*0.3)*0.2)))*2;
                    System.out.print(tutar);
                    break;
                }
                else
                {
                    tutar=((mesafe*km)-(mesafe*km*0.2))*2;
                    System.out.print(tutar);
                    break;
                }
            default:
                System.out.print("Hatalı giriş");




        }



    }
}