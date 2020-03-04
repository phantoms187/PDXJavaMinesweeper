package edu.pdx.cs410J.dwd2;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {



    System.exit(1);
  }

  static public int[][] buildEmptyGrid(int n, int m) {
    int[][] emptyGrid = new int[n][m];

    return emptyGrid;
  }

  public static char[][] parseBox(char[][] box) {
    char[][] answer = new char[box.length][box[0].length];
    for (int i = 0; i < box.length; i++) {
      for (int j = 0; j < box[i].length; j++) {
        char answerChar;
        if (box[i][j] == '.') {
          answerChar = '0';
        }
        else {
          answerChar = '*';
        }
        answer[i][j] = answerChar;
      }
    }

    return answer;
  }

}