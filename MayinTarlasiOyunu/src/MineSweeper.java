import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private char[][]map; //oyun alanı
    private char[][]mines; //mayınlar
    private int size; //arrayin boyutu
    private int remainingCells;
    private boolean gameEnded;

    public MineSweeper(int size)
    {
        //constructor fonksiyonu
        this.size=size;
        this.map=new char[size][size];
        this.mines=new char[size][size];
        this.remainingCells=(size*size)/4;
        this.gameEnded=false;
        initializeMap();
        placeMines();
        calculateAdjacentMines();

    }

    private void initializeMap()
    {
        //tabloyu hazırladım
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                map[i][j]='-';
            }

        }
    }

    private void placeMines()
    {
        //mayınları istenilen şekilde boyut*boyut/4 olarak random yerleştirdim.
        Random random=new Random();
        int mineCount=(size*size)/4;
        while(mineCount>0)
        {
            int row=random.nextInt(size);
            int col=random.nextInt(size);
            if(mines[row][col]!='*')
            {
                mines[row][col] = '*';
                mineCount--;
            }

        }
    }

    private void calculateAdjacentMines() {
        //mayının etraflarındaki sayıları yazdırmayı yaptım.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mines[i][j] != '*') {
                    int count = 0;
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            if (i + x >= 0 && i + x < size && j + y >= 0 && j + y < size && mines[i + x][j + y] == '*') {
                                count++;
                            }
                        }
                    }
                    mines[i][j] = (char) (count + '0');
                }
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!gameEnded) {
            System.out.print("Satır Giriniz (0 - " + (size - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz (0 - " + (size - 1) + "): ");
            int col = scanner.nextInt();

            if (row < 0 || row >= size || col < 0 || col >= size) {
                System.out.println("Geçersiz satır veya sütun! Lütfen tekrar girin.");
                continue;
            }

            if (map[row][col] != '-') {
                System.out.println("Bu hücre daha önce açıldı! Lütfen başka birini seçin.");
                continue;
            }

            if (mines[row][col] == '*') {
                System.out.println("Oyun Bitti! Bir mayına bastınız!");
                revealMines();
                gameEnded = true;
            } else {
                openCell(row, col);
                printMap();
                if (this.remainingCells == size * size - size * size / 4) {
                    System.out.println("Tebrikler! Tüm mayınları temizlediniz!");
                    gameEnded = true;
                }
            }
        }
    }

    private void openCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size || map[row][col] != '-') {
            return;
        }

        map[row][col] = mines[row][col];
        remainingCells--;

        if (mines[row][col] == '0') {
            openCell(row - 1, col - 1);
            openCell(row - 1, col);
            openCell(row - 1, col + 1);
            openCell(row, col - 1);
            openCell(row, col + 1);
            openCell(row + 1, col - 1);
            openCell(row + 1, col);
            openCell(row + 1, col + 1);
        }
    }

    private void revealMines() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mines[i][j] == '*') {
                    map[i][j] = '*';
                }
            }
        }
        printMap();
    }

}

