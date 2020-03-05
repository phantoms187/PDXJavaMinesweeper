package edu.pdx.cs410J.dwd2;

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
