//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın Tarlası Oyuna Hoşgeldiniz!\nAlanın Boyutunu Girin (en az 2): ");
        int size = scanner.nextInt();

        while (size < 2) {
            System.out.println("Boyut en az 2x2 olmalıdır! Lütfen tekrar girin.");
            size = scanner.nextInt();
        }

        MineSweeper game = new MineSweeper(size);
        game.printMap();
        game.play();


    }
}