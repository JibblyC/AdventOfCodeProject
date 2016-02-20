package com.testProject.adventofcode;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Created by Ciaran on 19/02/2016.
 *
 * Challange Overview :
 *
 * --- Day 2: I Was Told There Would Be No Math ---

 The elves are running low on wrapping paper, and so they need to submit an order for more. They have a list of the dimensions (length l, width w, and height h) of each present, and only want to order exactly as much as they need.

 Fortunately, every present is a box (a perfect right rectangular prism), which makes calculating the required wrapping paper for each gift a little easier: find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l. The elves also need a little extra paper for each present: the area of the smallest side.

 For example:

 A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper plus 6 square feet of slack, for a total of 58 square feet.
 A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper plus 1 square foot of slack, for a total of 43 square feet.
 All numbers in the elves' list are in feet. How many total square feet of wrapping paper should they order?
 */
public class Day2Challenge {
    public static void main(String[] args) throws IOException {


        FileIOUtil fileIOUtil = new FileIOUtil();

        String[] arrayOfNumbers = fileIOUtil.readFileIntoArray("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay2Challenge.txt");
        int totalSurfaceArea = 0;

        for (int i = 0; i < arrayOfNumbers.length ; i++) {

            String[] dimensions = arrayOfNumbers[i].split(Pattern.quote("x"));

            int length = Integer.parseInt(dimensions[0]);
            int width = Integer.parseInt(dimensions[1]);
            int height = Integer.parseInt(dimensions[2]);
            int sOne = (length * width);
            int sTwo = (width * height);
            int sThree = (length * height);

            int smallestArea = Math.min(Math.min(sOne,sTwo),sThree);

            totalSurfaceArea +=  smallestArea + (2*sOne) + (2*sTwo) + (2*sThree);
        }

        System.out.print("Total Surface Area : " + totalSurfaceArea);
    }
}
