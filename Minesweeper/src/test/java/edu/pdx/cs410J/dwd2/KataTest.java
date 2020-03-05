package edu.pdx.cs410J.dwd2;

import org.junit.Ignore;
import org.junit.Test;

import static edu.pdx.cs410J.dwd2.Kata.parseBox;
import static org.junit.Assert.*;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void twoSquaresOneBomb() {
    char[][] box = {{'.', '*'}};
    char[][] answer = {{'1', '*'}};

    char[][] parsedBox = parseBox(box);

    assertArrayEquals(answer, parsedBox);
  }

  @Test
  public void twoSquareOneBomb() {
    char[][] box = {{'*', '.'}};
    char[][] answer = {{'*', '1'}};

    char[][] parsedBox = parseBox(box);

    assertArrayEquals(parsedBox, answer);
  }


  @Test
  public void twoSquareNoBombs() {
    char[][] box = {{'.', '.'}};
    char[][] answer = {{'0', '0'}};

    char[][] parsedBox = parseBox(box);

    assertArrayEquals(parsedBox, answer);
  }

  @Test
  public void oneSquareNoBomb() {
    char[][] box = {{'.'}};
    char[][] answer = {{'0'}};

    char[][] parsedBox = parseBox(box);

    assertArrayEquals(parsedBox, answer);
  }

  @Test
  public void oneBomb() {
    char[][] box = {{'*'}};
    char[][] answer = {{'*'}};

    char[][] parsedBox = parseBox(box);

    assertArrayEquals(parsedBox, answer);
  }


  @Test
  public void exampleFromKata() {
    char[][] box = {{'*', '.', '.', '.'},
                    {'.', '.', '.', '.'},
                    {'.', '*', '.', '.'},
                    {'.', '.', '.', '.'}};

    char[][] parsedBox = parseBox(box);

    char[][] answer = {{'*', '1', '0', '0'},
            {'2', '2', '1', '0'},
            {'1', '*', '1', '0'},
            {'1', '1', '1', '0'}};

    assertArrayEquals(parsedBox, answer);
  }



}
