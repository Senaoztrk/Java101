//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int usluSayi(int base,int exp)
    {

        if(exp==0) {
            return 1;
        }

        else {
            return (base*usluSayi(base,exp-1));
        }


    }

    public static void main(String[] args) {

        System.out.print(usluSayi(2,3));

    }
}