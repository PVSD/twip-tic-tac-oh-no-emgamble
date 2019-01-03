package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner Option = new Scanner(System.in);
        System.out.println("For reference here is what the board's coordinates look like:");
        System.out.println("0,0 | 0,1 | 0,2" + "\n"+
                "---------------" + "\n" + "1,0 | 1,1 | 1,2" + "\n" +"---------------"
                + "\n" + "2,0 | 2,1 | 2,2");
        System.out.println("Choose an option from the list below and enter the letter of your option: \n A. Player vs Player" +
                " \n B. Player vs Computer \n C. Computer vs Computer");
        String choice = Option.nextLine();


        switch (choice) {
            case "A": {

                Scanner playerXx = new Scanner(System.in);
                Scanner playerXy = new Scanner(System.in);
                Scanner playerOx = new Scanner(System.in);
                Scanner playerOy = new Scanner(System.in);
                XO game = new XO();
                game.buildBoard();


                while (game.XWinner() == true && game.OWinner() == true) {
                    System.out.println("Player X please input the x coordinate of your move");
                    int x = playerXx.nextInt();
                    System.out.println("Player X please input the y coordinate of your move");
                    int y = playerXy.nextInt();
                    boolean c = game.Xmove(x, y);
                    if (c == false) {
                        System.out.println("Sorry that slot is already full Player X please input the x coordinate of your move");
                        int x1 = playerXx.nextInt();
                        System.out.println("Player X please input the y coordinate of your move");
                        int y2 = playerXy.nextInt();
                        boolean e = game.Xmove(x1, y2);
                    }


                    System.out.println(game.makeBoard());
                    if(game.XWinner()== false)
                        break;
                    else if(game.OWinner()== false)
                        break;

                    System.out.println("Player O please input the x coordinate of your move");
                    int a = playerOx.nextInt();
                    System.out.println("Player O please input the y coordinate of your move");
                    int b = playerOy.nextInt();
                    boolean d = game.Omove(a, b);
                    if (d == false) {
                        System.out.println("Sorry that slot is already full Player O please input the x coordinate of your move");
                        int x1O = playerOx.nextInt();
                        System.out.println("Player O please input the y coordinate of your move");
                        int y2O = playerOy.nextInt();
                        boolean f = game.Xmove(x1O, y2O);
                    }
                    System.out.println(game.makeBoard());
                    if(game.XWinner()== false)
                        break;
                    else if(game.OWinner()==false)
                        break;


                    if (game.CheckCompletion() == true) {
                        System.out.println("Its a draw!");
                        break;
                    }


                }
                if (game.OWinner() == true) {
                    System.out.println("Player X is the Winner");
                } else if (game.XWinner() == true) {
                    System.out.println("Player O is the Winner");
                }


                break;
            }
            case "B": {
                Scanner playerXx = new Scanner(System.in);
                Scanner playerXy = new Scanner(System.in);
                XO game = new XO();
                game.buildBoard();


                while (game.XWinner() == true && game.OWinner() == true) {
                    System.out.println("Player X please input the x coordinate of your move");
                    int x = playerXx.nextInt();
                    System.out.println("Player X please input the y coordinate of your move");
                    int y = playerXy.nextInt();
                    game.Xmove(x, y);
                    System.out.println(game.makeBoard());
                    if(game.XWinner()== false)
                        break;
                    else if(game.OWinner()== false)
                        break;

                    game.ComputerMove();
                    System.out.println(game.makeBoard());
                    if(game.XWinner()== false)
                        break;
                    else if(game.OWinner()== false)
                        break;


                    if (game.CheckCompletion() == false) {
                        System.out.println("Its a draw!");
                        break;
                    }


                }
                if (game.OWinner() == true) {
                    System.out.println("Player X is the Winner");
                } else if (game.XWinner() == true) {
                    System.out.println("Player O is the Winner");
                }

                break;
            }
            case "C": {

                XO game = new XO();
                game.buildBoard();
                Random randx = new Random();
                int x = randx.nextInt(3);
                Random randy = new Random();
                int y = randx.nextInt(3);
                game.FirstComputerMoveX(x, y);


                while (game.XWinner() == true && game.OWinner() == true) {


                    game.ComputerMove();
                    System.out.println(game.makeBoard());

                    game.ComputerMoveX();
                    System.out.println(game.makeBoard());


                    if (game.CheckCompletion() == true) {
                        System.out.println("Its a draw!");
                        break;
                    }


                }
                if (game.OWinner() == true) {
                    System.out.println("Player O is the Winner");
                } else if (game.XWinner() == true) {
                    System.out.println("Player X is the Winner");
                }

                break;
            }
        }

    }

}
