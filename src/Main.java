import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char symbolOfUser = 'a';
        System.out.println("Gra kolko i krzyzyk z komputerem.\nAby rozpocząć grę kliknij 1.");
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe (rozmiar planszy do gry): ");
        int sizeOfGameBoard = in.nextInt();
        char[][] gameBoard = new char[sizeOfGameBoard][sizeOfGameBoard];

        while(true){
            System.out.print("Wybierz symbol: kółko lub krzyżyk - ");
            symbolOfUser = in.next().charAt(0);
            if(symbolOfUser == 'o' || symbolOfUser == 'x')
                break;
            System.out.println("Podano niepoprawny symbol. Musisz spróbować jeszcze raz.");
        }

        for(int i = 0; i<sizeOfGameBoard; i++){
            for(int j = 0; j< sizeOfGameBoard; j++){
                gameBoard[i][j] = symbolOfUser;
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
