//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int dizi[]={1,2,2,4,5,5,5};

        int[] frekanslar = new int[dizi.length];

        // Her elemanın frekansını hesaplayın
        for (int i = 0; i < dizi.length; i++) {
            for(int k=0;k<dizi.length;k++)
            {
                if(i!=k&& dizi[i]==dizi[k])
                {
                    int eleman = dizi[i];
                    int frekans = 0;
                    for (int j = 0; j < dizi.length; j++) {
                        if (dizi[j] == eleman) {
                            frekans++;
                        }
                    }
                    frekanslar[i] = frekans;
                }
            }

        }

        // Sonuçları ekrana yazdır
        System.out.println("Dizideki elemanların frekansları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i] + " sayısı " + frekanslar[i] + " kez tekrar edildi.");
        }
    }

}