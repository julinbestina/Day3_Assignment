package com.bridgelabz.day3;

import java.util.*;

public class LineComparison {
    public static void main(String[] args) {

        int x1 = 1, y1 = 3, x2 =5, y2 = 3;
        int x3 = -2, y3 = -1, x4 = 1, y4 = 3;

        double line1Length = Math.sqrt((x2 - x1) ^ 2 + (y1 - y2) ^ 2);
        double line2Length = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);

        System.out.println("Length of two lines : " + line1Length + ", " + line2Length);

        boolean isEqual = Objects.equals(line1Length, line2Length);

        if(isEqual)
            System.out.println("Lines are Equal");
        else
            System.out.println("Lines are not Equal");

    }

}
