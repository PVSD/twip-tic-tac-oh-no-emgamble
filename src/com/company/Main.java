package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] [] board = new String[3][3];
        Scanner playerX = new Scanner(System.in);
        Scanner playerO = new Scanner(System.in);

        while(true) {
            System.out.println("Player X please input your first move as a coordinate (x y), remember the board starts at 0.");
            int x = playerX.nextInt();
            int y = playerX.nextInt();
            if(!board[x][y].equals("X")||!board[x][y].equals("O")) {
                board[x][y] = "X";
            }
            else
                System.out.println("Sorry that slot is already full");

            System.out.println("Player O please input your first move as a coordinate (x y), remember the board starts at 0.");
            int a = playerO.nextInt();
            int b = playerX.nextInt();
            if(!board[a][b].equals("X")||!board[x][y].equals("O")) {
                board[a][b] = "O";
            }
            else
                System.out.println("Sorry that slot is already full");

            String line = null;
            int testWinner = 8;
            switch (testWinner){
                case 1: line = board[0][0] + board[0][1] + board[0][2];
                    break;
                case 2: line = board[1][0] + board[1][1] + board[1][2];
                    break;
                case 3: line = board[2][0] + board[2][1] + board[2][2];
                    break;
                case 4: line = board[0][1] + board[1][1] + board[2][1];
                    break;
                case 5: line = board[0][2] + board[1][2] + board[2][2];
                    break;
                case 6: line = board[0][0] + board[1][0] + board[2][0];
                    break;
            }

        }




    }
}
