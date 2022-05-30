package com.bridgelabz.day3;

import java.util.*;
import java.lang.Integer;

public class LineComparison {
    public static void main(String[] args) {
        Integer x1 = new Integer(1);
        Integer x2 = new Integer(5);
        Integer x3 = new Integer(-2);
        Integer x4 = new Integer(1);
        Integer y1 = new Integer(3);
        Integer y2 = new Integer(3);
        Integer y3 = new Integer(-1);
        Integer y4 = new Integer(3);

        Double line1Length = Math.sqrt((x2 - x1) ^ 2 + (y1 - y2) ^ 2);
        Double line2Length = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);

        System.out.println("Length of two lines : " + line1Length + ", " + line2Length);

        int isEqual = line1Length.compareTo(line2Length);

        if (isEqual > 0)
            System.out.println("Line1 is greater than Line2 ");
        else if (isEqual < 0)
            System.out.println("Line2 is greater than Line1");
        else
            System.out.println("Line1 is equal to Line2");

    }

}
