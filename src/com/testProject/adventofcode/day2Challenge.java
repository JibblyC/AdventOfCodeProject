package com.testProject.adventofcode;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Created by Ciaran on 19/02/2016.
 *
 */
public class Day2Challenge {

    private int length = 0;
    private int width = 0;
    private int height = 0;
    int totalWrappingPaperNeeded = 0;
    int totalRibbonNeeded = 0;

    public static void main(String[] args) throws IOException {

        FileIOUtil fileIOUtil = new FileIOUtil();
        String[] arrayOfNumbers = fileIOUtil.readFileIntoArray("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay2Challenge.txt");

        Day2Challenge day2Challenge = new Day2Challenge();
        day2Challenge.calculateTotalPaperAndRibbon(arrayOfNumbers);
        System.out.println("Total Wrapping Paper Needed : " + day2Challenge.getTotalWrappingPaperNeeded());
        System.out.println("Total Ribbon Paper Needed : " + day2Challenge.getTotalRibbonNeeded());
    }
    public void calculateTotalPaperAndRibbon(String[] inputFromFile) {

        for (int i = 0; i < inputFromFile.length; i++) {

            populateDimensions(inputFromFile[i]);
            calculateTotalWrappingPaper();
            calculateTotalRibbonNeeded();
        }

    }

    private void calculateTotalWrappingPaper(){
        int sOne = (length * width);
        int sTwo = (width * height);
        int sThree = (length * height);

        int smallestArea = Math.min(Math.min(sOne, sTwo), sThree);
        totalWrappingPaperNeeded += smallestArea + (2 * sOne) + (2 * sTwo) + (2 * sThree);
    }

    private void calculateTotalRibbonNeeded(){

        int smallestSides = Math.min(Math.min((length + width),(height + width)),(height + length));


        int ribbonToWrap = (2 * smallestSides) + (length * width * height);
        totalRibbonNeeded += ribbonToWrap;
        System.out.println(ribbonToWrap);
    }

    private void populateDimensions(String inputLine) {

        String[] dimensions = inputLine.split(Pattern.quote("x"));
        length = Integer.parseInt(dimensions[0]);
        width = Integer.parseInt(dimensions[1]);
        height = Integer.parseInt(dimensions[2]);

    }
    public int getTotalWrappingPaperNeeded() {
        return totalWrappingPaperNeeded;
    }

    public int getTotalRibbonNeeded() {
        return totalRibbonNeeded;
    }
}
