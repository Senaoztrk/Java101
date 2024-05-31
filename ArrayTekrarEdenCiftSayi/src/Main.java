import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean isFind(int []arr,int value)
    {
        for(int i:arr)
        {
            if(i==value)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int list[]={1,2,3,2,4,5,6,4};
        int duplicate[]=new int[list.length];
        int start=0;

        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length;j++)
            {
                if(i!=j && list[i]==list[j])
                {
                    if(list[i]%2==0)
                    {
                        if(!isFind(duplicate,list[i]))
                        {
                            duplicate[start++]=list[i];

                        }
                        break;

                    }
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}