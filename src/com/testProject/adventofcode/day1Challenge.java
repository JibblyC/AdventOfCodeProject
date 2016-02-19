package com.testProject.adventofcode;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;

/**
 * Created by Ciaran on 19/02/2016.
 */
public class day1Challenge {
    public static void main(String[] args) throws IOException {

        FileIOUtil fileIOUtil = new FileIOUtil();

        String inputForCode = fileIOUtil.readFile("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay1Challenge.txt");

        int countFloors = 0;
        char openBracket = '(';
        char closeBracket = ')';


        for (int i = 0; i < inputForCode.length() - 1; i++) {
            if (inputForCode.charAt(i) == openBracket) {
                countFloors++;
            } else if (inputForCode.charAt(i) == closeBracket) {
                countFloors--;
            }
            System.out.println("Floors : " + countFloors);
        }
    }
}
