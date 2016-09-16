package com.testProject.adventofcode.Day3Challenge;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ciaran on 01/03/2016.
 */
public class Day3Challenge {


    static Set<Coordinates> housesVisited = new HashSet<Coordinates>();
    Coordinates current = new Coordinates(0, 0);


    public static void main(String[] args) throws IOException {

        FileIOUtil fileIOUtil = new FileIOUtil();
        String inputForCode = fileIOUtil.readFileIntoSingleString("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay3Challenge.txt");

        //String inputForCode = "^>v<";

        Day3Challenge day3Challenge = new Day3Challenge();
       housesVisited.add(new Coordinates(0,0));

        for (int i = 0 ; i < inputForCode.length() - 1;i++){
            Coordinates result = day3Challenge.calculateDirection("" + inputForCode.charAt(i),day3Challenge.current);
            Coordinates newCO = new Coordinates(day3Challenge.current.getX(),day3Challenge.current.getY());

            housesVisited.add(newCO);
        }
        System.out.println(housesVisited.size());

        for(Coordinates s : housesVisited){
            System.out.println(s.toString());
        }

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