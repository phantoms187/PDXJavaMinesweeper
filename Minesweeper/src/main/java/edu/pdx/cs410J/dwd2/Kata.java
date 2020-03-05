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
        answerChar = getAnswerChar(box, i, j);
        answer[i][j] = answerChar;
      }
    }

    return answer;
  }

  public static char checkLeftRight(char[][] box, int row, int column){
    int count = 0;

    int [] iter = {-1, 0, 1};
    for (int i : iter)
    {
      for(int j : iter)
      {
        if(cellContainsBomb(box, row+i, column+j)){
          count++;
        }
      }
    }
    return Character.forDigit(count, 10);
  }

  public static boolean cellContainsBomb(char[][] box, int row, int column){
    if(column < 0 || column >= box[0].length || row < 0 || row >= box.length) {
        return false;
    }
    return box[row][column] == '*';
  }

  private static char getAnswerChar(char[][] box, int i, int j) {
    char answerChar;
    if (box[i][j] == '.') {
      answerChar = checkLeftRight(box, i, j);
    }
    else {
      answerChar = '*';
    }
    return answerChar;
  }

}