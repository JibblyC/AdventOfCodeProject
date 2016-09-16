package com.testProject.adventofcode.Day3Challenge;

/**
 * Created by Ciaran on 16/09/2016.
 */
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


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Coordinates)
            if(((Coordinates) obj).getX() == this.x &&((Coordinates) obj).getY() == this.y)
                return true;
        return false;
    }
    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = ((hash + x) << 5) - (hash + x);
        hash = ((hash + y) << 5) - (hash + y);
        return hash;
    }
}