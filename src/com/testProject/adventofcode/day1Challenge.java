package com.testProject.adventofcode;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;

/**
 * Created by Ciaran on 19/02/2016.
 */
public class Day1Challenge {
    public static void main(String[] args) throws IOException {



        FileIOUtil fileIOUtil = new FileIOUtil();
        String inputForCode = fileIOUtil.readFileIntoSingleString("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay1Challenge.txt");

        Day1Challenge day1Challenge = new Day1Challenge();

        day1Challenge.calcuteTotalFloors(inputForCode);
        System.out.println("Finishing Floor : " + day1Challenge.getcountFloors());
        System.out.println("First basement Floor number : " + day1Challenge.getFirstBasementEntry());

    }
    private char openBracket = '(';
    private char closeBracket = ')';
    int countFloors = 0;
    int firstBasementEntry = 0;
    boolean firstBasementfound = true;

    public void calcuteTotalFloors(String inputForCode){

        for (int i = 0; i < inputForCode.length(); i++) {
            changeFloor(inputForCode.charAt(i));
            checkFirstBasement(i);
        }
    }

    private void changeFloor(char inputFromString){
        if (inputFromString == openBracket) {
            countFloors++;
        } else if (inputFromString == closeBracket) {
            countFloors--;
        }
    }
    private void checkFirstBasement(int currentCharNumber){
        if (countFloors==-1 && firstBasementfound) {
            firstBasementEntry = currentCharNumber + 1;
            firstBasementfound = false;
        }
    }

    public int getcountFloors(){
        return countFloors;
    }
    public int getFirstBasementEntry(){
        return firstBasementEntry;
    }

}
