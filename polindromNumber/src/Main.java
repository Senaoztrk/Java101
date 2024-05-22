//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPolindrom(int num)
    {
        int temp=num,reverseNumber=0,lastNumber;
        while(temp!=0)
        {
            System.out.println("********");
            System.out.println("Number= "+num);

            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("Last number= "+lastNumber);
            System.out.println("Reverse number= "+reverseNumber);

            temp/=10;

        }

        if(num==reverseNumber)
        {
            return true;
        }
        else {
            return false;
        }

    }



    public static void main(String[] args) {
        System.out.print("Polindrom sayı mı?-> "+isPolindrom(101));


    }
}