package com.company;

public class Cell {
    private final static char[] cell_letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    private int x;
    private int y;

    public Cell(int x, int y) throws IllegalArgumentException{
        if (x > 7 || x < 0 || y > 7 || y < 0)
            throw new IllegalArgumentException("wrong arguments");

        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x) throws IllegalArgumentException{
        if (x>7 || x<0)
            throw new IllegalArgumentException("wrong x position");

        else this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalArgumentException {
        if (y > 7 || y < 0)
            throw new IllegalArgumentException("wrong y position");

        this.y = y;
    }

    @Override
    public String toString() {
        return String.valueOf(cell_letter[x]) + (y + 1);
    }
}
