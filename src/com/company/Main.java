package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner Option = new Scanner(System.in);
        System.out.println("Choose an option from the list below and enter the letter of your option: \n A. Player vs Player" +
                " \n B. Player vs Computer \n C. Computer vs Computer");
        String choice = Option.nextLine();


        if (choice.equals("A")) {

            Scanner playerXx = new Scanner(System.in);
            Scanner playerXy = new Scanner(System.in);
            Scanner playerOx = new Scanner(System.in);
            Scanner playerOy = new Scanner(System.in);
            XO game = new XO();
            game.buildBoard();


            while (game.Winner() == null) {
                System.out.println("Player X please input the x coordinate of your move");
                int x = playerXx.nextInt();
                System.out.println("Player X please input the y coordinate of your move");
                int y = playerXy.nextInt();
                game.Xmove(x, y);
                System.out.println(game.makeBoard());

                System.out.println("Player O please input the x coordinate of your move");
                int a = playerOx.nextInt();
                System.out.println("Player X please input the y coordinate of your move");
                int b = playerOy.nextInt();
                game.Omove(a, b);
                System.out.println(game.makeBoard());


                if (game.CheckCompletion() == true) {
                    System.out.println("Its a draw!");
                    break;
                }


            }
            System.out.println(game.Winner());


        }
        else if (choice.equals("B")){
            Scanner playerXx = new Scanner(System.in);
            Scanner playerXy = new Scanner(System.in);
            XO game = new XO();
            game.buildBoard();



            while (game.Winner() == null) {
                System.out.println("Player X please input the x coordinate of your move");
                int x = playerXx.nextInt();
                System.out.println("Player X please input the y coordinate of your move");
                int y = playerXy.nextInt();
                game.Xmove(x, y);
                System.out.println(game.makeBoard());

                game.ComputerMove();
                System.out.println(game.makeBoard());


                if (game.CheckCompletion() == true) {
                    System.out.println("Its a draw!");
                    break;
                }


            }
            System.out.println(game.Winner());

        }
        else if (choice.equals("C")){

            XO game = new XO();
            game.buildBoard();
            Random randx = new Random();
            int x = randx.nextInt(3);
            Random randy = new Random();
            int y = randx.nextInt(3);
            game.FirstComputerMoveX(x,y);


            while (game.Winner() == null) {


                game.ComputerMove();
                System.out.println(game.makeBoard());

                game.ComputerMoveX();
                System.out.println(game.makeBoard());



                if (game.CheckCompletion() == true) {
                    System.out.println("Its a draw!");
                    break;
                }


            }
            System.out.println(game.Winner());

        }

    }

}
