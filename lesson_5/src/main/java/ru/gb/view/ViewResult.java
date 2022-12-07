package ru.gb.view;

import java.util.logging.Logger;

public class ViewResult {
    private static final Logger logger = Logger.getLogger(ViewResult.class.getName());
  public static <T> void show(T numberResult) {
      String output = "\nРезультат работы: " + numberResult;
      System.out.println(output);
  }
}