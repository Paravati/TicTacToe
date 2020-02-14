package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gra kolko i krzyzyk z komputerem.\nAby rozpocząć grę kliknij 1.");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe (rozmiar planszy do gry)");
        int sizeOfGameBoard = in.nextInt();
        char[][] gameBoard = new char[sizeOfGameBoard][sizeOfGameBoard];

        for(int i = 0; i<sizeOfGameBoard; i++){
            for(int j = 0; j< sizeOfGameBoard; j++){
                gameBoard[i][j] = 'x';
            }
        }

        //printing gameBoard
        for(char[] row: gameBoard){
            for(char column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
