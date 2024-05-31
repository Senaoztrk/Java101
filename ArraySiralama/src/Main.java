//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        int boyut;
        int elemanlar;
        System.out.print("Dizinin boyutunu girin: ");
        boyut=inp.nextInt();
        int dizi[]=new int[boyut];

        for(int i=0;i<dizi.length;i++)
        {

            dizi[i]=inp.nextInt();

        }

        Arrays.sort(dizi);

        for(int i=0;i<dizi.length;i++)
        {
            System.out.print(dizi[i]+" ");
        }

    }
}