import java.util.Scanner;
public class Connect4 {
    private int[][] gameboard = new int [6][7];

    public Connect4() {
        for (int i = 0; i < 6; i++) {
            gameboard[0][i] = 0;
            gameboard[1][i] = 0;
            gameboard[2][i] = 0;
            gameboard[3][i] = 0;
            gameboard[4][i] = 0;

        }
        System.out.println("Use the playConnect4 method to begin game");
    }        

    public int[][] test() {
       return gameboard;
    }
    
    public void playConnect4() {
        System.out.print("" + "|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] + "|" + gameboard[0][6] + "|");
        System.out.print("" + "|" + gameboard[0][0] + "|" +gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] +  "|" +gameboard[0][6] + "|");
        System.out.print("" + "|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] + "|" + gameboard[0][6] + "|");
        System.out.print("" + "|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" +gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] +  "|" +gameboard[0][6] + "|");
        System.out.print("" + "|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" +gameboard[0][5] +  "|" +gameboard[0][6] + "|");
        System.out.print("" + "|" + gameboard[0][0] + "|" + gameboard[0][1] + "|" + gameboard[0][2] + "|" + gameboard[0][3] + "|" + gameboard[0][4] + "|" + gameboard[0][5] +  "|" +gameboard[0][6] + "|");
                       
    }
}   