package com.testProject.adventofcode;

import com.testProject.utilclasses.FileIOUtil;

import java.io.IOException;
import java.util.HashSet;

/**
 * Created by Ciaran on 01/03/2016.
 */
public class Day3Challenge {

    public static void main(String[] args) throws IOException {

        FileIOUtil fileIOUtil = new FileIOUtil();
        String[] arrayOfNumbers = fileIOUtil.readFileIntoArray("C:\\Users\\Ciaran\\Documents\\ClutterStuff\\GenericTextFiles\\InputforDay2Challenge.txt");

    }

    HashSet<Coordinates> housesVisited = new HashSet<Coordinates>();
    Coordinates current = new Coordinates(0,0);



    private Coordinates calculateDirection(String inputString){

    }





    class Coordinates{
        int x;
        int y;
        Coordinates(int x, int y){
            this.x=x;
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
