package Pratik.MineSweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    String[][] map;  //mayınların açık halde bulunduğu harita
    String[][] board; // oyun oynanılan yer
    int size;
    boolean isFinish;
    boolean isWin;

    int ConditionToWin;
    public MineSweeper(int row, int col) {
        this.rowNumber = row;
        this.colNumber = col;
        this.map = new String[this.rowNumber][this.colNumber];
        this.board = new String[this.rowNumber][this.colNumber];
        this.size = (row * col) / 4;
        this.isFinish = false;
        this.isWin = false;
    }


    public void run() {


        createBoard();
        randomMap();
        print(1);
        System.out.println("====================");
        System.out.println("Welcome to MineSweeper Game !");

        while(!isFinish) {
            print(0);
            System.out.print("Enter a row : ");
            int row = input.nextInt();
            System.out.print("Enter a column : ");
            int col = input.nextInt();
            System.out.println("====================");

            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {

                System.out.println("Invalid Format !");
                continue;
            }
            else{
                if (map[row][col].equals(" * ")) {
                    System.out.println();
                    System.out.println("!!!   Game Over   !!!");
                    System.out.println();
                    isFinish = true;
                    isWin = false;
                    break;
                } else {
                    ConditionToWin--;
                }
                if (ConditionToWin <= 0){
                    System.out.println("Congratulations ! You won game !");
                    int sum = check(row, col);
                    board[row][col] = String.valueOf(sum + " ");
                    isFinish = true;
                    isWin = true;
                    print(board);
                    break;
                } else {
                    int sum = check(row, col);
                    board[row][col] = String.valueOf(sum + "  ");
                }
            }


        }

    }


    //Matrislerin içerisi dolduruluyor.
    public void createBoard()
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                this.board[i][j] = " - ";
                this.map[i][j] = " - ";
            }
        }
    }


    //Mayınlar rastgele üretiliyor
    public void randomMap()
    {
        int rowRastgele, colRastgele;
        this.ConditionToWin = (this.rowNumber * this.colNumber) - size;
        for (int i = 0; i < size ; i++) {

            rowRastgele = rand.nextInt(this.rowNumber);

            colRastgele = rand.nextInt(this.colNumber);

            if(this.map[rowRastgele][colRastgele] == " * ")
            {
                i--;
            }
            else {
                this.map[rowRastgele][colRastgele] = " * ";
            }
        }
    }

    //Ekrana yazdırmak için seçim yapılan yer
    public void print(int a)
    {
        if(a == 1)
        {
            System.out.println("Location of Mines");
            System.out.println("====================");
            print(this.map);
        }
        else{
            print(this.board);
        }
    }

    //Ekrana yazdırmak
    public void print(String[][] arr)
    {
        for (String[] temp: arr) {

            for (String temp2:temp) {

                System.out.print(temp2 + " ");
            }
            System.out.println(" ");
        }
    }

    // Kullanıcının girdiği satır ve sütun değerlerine göre çevresinde ne kadar yıldız varsa o kadar değer artırılıyor.
    public int check(int row, int col)
    {
        int sum = 0;
        if(row - 1 >=0 && col - 1 >=0 )
            if(map[row - 1][col - 1] == " * ")
                sum++;
        if(row - 1 >= 0)
            if(map[row - 1][col] == " * ")
                sum++;
        if(row - 1 >= 0 && col + 1 < this.colNumber)
            if(map[row - 1][col + 1] == " * ")
                sum++;
        if(col - 1 >= 0 )
            if(map[row][col - 1] == " * ")
                sum++;
        if(col + 1 < this.colNumber)
            if(map[row][col + 1] == " * ")
                sum++;
        if(row + 1 < this.rowNumber && col - 1 >= 0)
            if(map[row + 1][col - 1] == " * ")
                sum++;
        if(row + 1 < this.rowNumber)
            if(map[row + 1][col] == " * ")
                sum++;
        if(row + 1 < this.rowNumber && col + 1 < this.colNumber)
            if(map[row + 1][col + 1] == " * ")
                sum++;

        return sum;
    }


}






