package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] [] board = new String[3][3];
        Scanner playerX = new Scanner(System.in);
        Scanner playerO = new Scanner(System.in);

        System.out.println("Player X please input your first move as a coordinate (x y), remember the board starts at 0.");
        int x = playerX.nextInt();
        int y = playerX.nextInt();
        board [x] [y]= "X";
        System.out.println(board);
        System.out.println("Player O please input your first move as a coordinate (x y), remember the board starts at 0.");
        int a = playerO.nextInt();
        int b = playerX.nextInt();
        board [a] [b]= "O";
        System.out.println(board);



    }
}
