package com.bridgelabz.day3;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        //Scanner sc = new Scanner();
        int x1 = 1, y1 = 3, x2 =5, y2 = 3;
        double lineLength = Math.sqrt((x2 - x1) ^ 2 + (y1 - y2) ^ 2);
        System.out.println("Line Length= " + lineLength);
    }

}
