package com.company;


import java.util.HashSet;
import java.util.Set;

public  class Showtime {
    //возвращает набор мест

    Set<Seat> freeSeats = new HashSet<>();
    private String movieTitle;

    public Showtime( int rows, int seats, String movieTitle) {

        this.freeSeats = new HashSet<>();
        this.movieTitle = movieTitle;

        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < seats + 1; j++) freeSeats.add(new Seat(i, j));
        }
    }

    public Set<Seat> getFreeSeats() {
        return freeSeats;
    }
    public String getMovieTitle() {
        return movieTitle;
    }

    public boolean bookSeat(Seat seatToBook) {
        return freeSeats.remove(seatToBook);
    }

    @Override
    public String toString() {
        return "Showtime{" +
                "movieTitle='" + movieTitle + '\'' +
                ", freeSeats=" + freeSeats +
                '}';
    }


}