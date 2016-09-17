package com.testProject.adventofcode.Day3Challenge;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ciaran on 01/03/2016.
 */
public class Day3Challenge {


    static Set<Coordinates> housesVisited = new HashSet<Coordinates>();
    Coordinates currentSanta = new Coordinates(0, 0);
    Coordinates currentRoboSanta = new Coordinates(0, 0);


    public static void main(String[] args) throws IOException {

        FileIOUtil fileIOUtil = new FileIOUtil();
        String inputForCode = fileIOUtil.readFileIntoSingleString("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay3Challenge.txt");
        //String inputForCode = "^>v<";

        Day3Challenge day3Challenge = new Day3Challenge();
        housesVisited.add(new Coordinates(0,0));

        for (int i = 0 ; i < inputForCode.length();i++){
            if(i % 2 == 0){
                Coordinates result = day3Challenge.calculateDirection("" + inputForCode.charAt(i),day3Challenge.currentSanta);
                Coordinates newCO = new Coordinates(day3Challenge.currentSanta.getX(),day3Challenge.currentSanta.getY());
                housesVisited.add(newCO);
            }
            else
            {
                Coordinates result = day3Challenge.calculateDirection("" + inputForCode.charAt(i),day3Challenge.currentRoboSanta);
                Coordinates newCO = new Coordinates(day3Challenge.currentRoboSanta.getX(),day3Challenge.currentRoboSanta.getY());
                housesVisited.add(newCO);
            }

        }
        System.out.println(housesVisited.size() + " " +  (0 % 2) +" " + (1%2) + " " + (2%2) );
    }


    private Coordinates calculateDirection(String directions, Coordinates current) {

        int x = current.getX();
        int y = current.getY();
        switch (directions) {
            case "^":
                x += 1;
                break;
            case ">":
                y += 1;
                break;
            case "<":
                y -= 1;
                break;
            case "v":
                x -= 1;
                break;
        }
        current.setX(x);
        current.setY(y);
        return current;
    }
}