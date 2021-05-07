package com.company;

import java.util.Objects;

public class Seat{


    private final int row;
    private final int seat;


    public Seat(int row, int seat) {
        this.row = row;
        this.seat = seat;

    }
    public int getRow() {
        return row;
    }
    public int getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return row + ":" + seat;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof Seat))
            return false;
        Seat place = (Seat)obj;
        return row == place.row && seat == place.seat;
    }
    @Override
    public int hashCode() {
        return Objects.hash(row, seat);
    }
}
