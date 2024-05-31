
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double list[]={1,2,3,4};
        double sum=0.0;
        for(int i=0;i<list.length;i++)
        {
            sum+=(1/list[i]);

        }
       System.out.println(sum);

       double harmonikOrt=(list.length)/sum;
       System.out.println("Harmonik Ortalama: "+harmonikOrt);

    }
}