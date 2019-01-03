package com.company;

public class XO {
    public String board [][] = new String[3][3];
    public int a;


    public XO() {
        a = 0;
    }
    public void buildBoard(){
        board[0][0] = " ";
        board[0][1] = " ";
        board[0][2] = " ";
        board[1][0] = " ";
        board[1][1] = " ";
        board[1][2] = " ";
        board[2][0] = " ";
        board[2][1] = " ";
        board[2][2] = " ";
    }
    public boolean Xmove(int Xx,int Xy) {

        if (testMove(board, Xx, Xy) == true) {
            board[Xx][Xy] = "X";
            return true;
        }
        else
            return false;
    }
    public boolean Omove(int Ox, int Oy){
        if (testMove(board, Ox, Oy)==true){
            board[Ox][Oy] = "O";
            return true;
        }
        else
            return false;

    }
    public boolean testMove(String XOboard [][], int x, int y){
        if(XOboard [x][y] == " "){
            return true;
        }
        else
            return false;
    }
    public String makeBoard(){
        String madeBoard = board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n"+
        "---------------" + "\n" + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n" +"---------------"
                + "\n" + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ";
        return madeBoard;
    }
    public boolean XWinner(){
        int testWinner = 8;
        String line = null;
        switch (testWinner) {
            case 1:
                line = board[0][0] + board[0][1] + board[0][2];
                break;
            case 2:
                line = board[1][0] + board[1][1] + board[1][2];
                break;
            case 3:
                line = board[2][0] + board[2][1] + board[2][2];
                break;
            case 4:
                line = board[0][1] + board[1][1] + board[2][1];
                break;
            case 5:
                line = board[0][2] + board[1][2] + board[2][2];
                break;
            case 6:
                line = board[0][0] + board[1][0] + board[2][0];
                break;
            case 7:
                line = board[0][0] + board[1][1] + board[2][2];
                break;
            case 8:
                line = board[2][0] + board[1][1] + board[0][2];
                break;
        }
        if(line.equals("XXX")) {
            return true;
        }
        else return false;
    }
    public boolean OWinner(){
        int testWinner = 8;
        String line = null;
        switch (testWinner) {
            case 1:
                line = board[0][0] + board[0][1] + board[0][2];
                break;
            case 2:
                line = board[1][0] + board[1][1] + board[1][2];
                break;
            case 3:
                line = board[2][0] + board[2][1] + board[2][2];
                break;
            case 4:
                line = board[0][1] + board[1][1] + board[2][1];
                break;
            case 5:
                line = board[0][2] + board[1][2] + board[2][2];
                break;
            case 6:
                line = board[0][0] + board[1][0] + board[2][0];
                break;
            case 7:
                line = board[0][0] + board[1][1] + board[2][2];
                break;
            case 8:
                line = board[2][0] + board[1][1] + board[0][2];
                break;
        }
        if(line.equals("OOO")) {
            return true;
        }
        else return false;
    }

    public boolean CheckCompletion(){
        if( !board[0][0].equals(" ")
                && !board[0][1].equals(" ")
                && !board[0][2].equals(" ")
                && !board[1][1].equals(" ")
                && !board[1][2].equals(" ")
                && !board[2][0].equals(" ")
                && !board[2][1].equals(" ")
                && !board[2][2].equals(" ")){
            return true;
        }
        else
            return false;

    }
    public  void ComputerMove(){
        if(board[0][0].equals("X")|| board[0][2].equals("X")||board[2][0].equals("X")||board[2][2].equals("X")){
            if(board[1][1].equals(" "))
                board[1][1] = "O";
        }
        else if(board[1][1].equals("X")) {
            if (board[0][0].equals(" "))
                board[0][0] = "O";
            else if (board[0][2].equals(" "))
                board[0][2] = "O";
            else if (board[2][0].equals(" "))
                board[2][0] = "O";
            else if (board[2][2].equals(" "))
                board[2][2] = "O";
        }
        else if(board[1][0].equals("X")) {
            if (board[1][1].equals(" "))
                board[1][1] = "O";
            else if (board[0][0].equals(" "))
                board[0][0] = "O";
            else if (board[2][0].equals(" "))
                board[2][0] = "O";
            else if (board[1][2].equals(" "))
                board[1][2] = "O";
        }
        else if(board[1][2].equals("X")) {
            if (board[1][1].equals(" "))
                board[1][1] = "O";
            else if (board[0][2].equals(" "))
                board[0][2] = "O";
            else if (board[2][2].equals(" "))
                board[2][2] = "O";
            else if (board[1][0].equals(" "))
                board[1][0] = "O";
        }
        else if(board[0][1].equals("X")) {
            if (board[1][1].equals(" "))
                board[1][1] = "O";
            else if (board[0][2].equals(" "))
                board[0][2] = "O";
            else if (board[0][0].equals(" "))
                board[0][0] = "O";
            else if (board[2][1].equals(" "))
                board[2][1] = "O";
        }
        else if(board[2][1].equals("X")) {
            if (board[1][1].equals(" "))
                board[1][1] = "O";
            else if (board[0][1].equals(" "))
                board[0][1] = "O";
            else if (board[2][2].equals(" "))
                board[2][2] = "O";
            else if (board[2][0].equals(" "))
                board[2][0] = "O";
        }


    }
    public void FirstComputerMoveX(int rX,int rY) {
        board[rX][rY] = "O";
    }

    public void ComputerMoveX(){

            if (board[0][0].equals("O") || board[0][2].equals("O") || board[2][0].equals("O") || board[2][2].equals("O")) {
                if (board[1][1].equals(" "))
                    board[1][1] = "O";
            } else if (board[1][1].equals("O")) {
                if (board[0][0].equals(" "))
                    board[0][0] = "O";
                else if (board[0][2].equals(" "))
                    board[0][2] = "O";
                else if (board[2][0].equals(" "))
                    board[2][0] = "O";
                else if (board[2][2].equals(" "))
                    board[2][2] = "O";
            } else if (board[1][0].equals("O")) {
                if (board[1][1].equals(" "))
                    board[1][1] = "O";
                else if (board[0][0].equals(" "))
                    board[0][0] = "O";
                else if (board[2][0].equals(" "))
                    board[2][0] = "O";
                else if (board[1][2].equals(" "))
                    board[1][2] = "O";
            } else if (board[1][2].equals("O")) {
                if (board[1][1].equals(" "))
                    board[1][1] = "O";
                else if (board[0][2].equals(" "))
                    board[0][2] = "O";
                else if (board[2][2].equals(" "))
                    board[2][2] = "O";
                else if (board[1][0].equals(" "))
                    board[1][0] = "O";
            } else if (board[0][1].equals("O")) {
                if (board[1][1].equals(" "))
                    board[1][1] = "O";
                else if (board[0][2].equals(" "))
                    board[0][2] = "O";
                else if (board[0][0].equals(" "))
                    board[0][0] = "O";
                else if (board[2][1].equals(" "))
                    board[2][1] = "O";
            } else if (board[2][1].equals("O")) {
                if (board[1][1].equals(" "))
                    board[1][1] = "O";
                else if (board[0][1].equals(" "))
                    board[0][1] = "O";
                else if (board[2][2].equals(" "))
                    board[2][2] = "O";
                else if (board[2][0].equals(" "))
                    board[2][0] = "O";
            }


        }
    }




