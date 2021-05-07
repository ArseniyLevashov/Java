package com.company;

public class Main  {
    public static void main(String[] args) throws InterruptedException {
	// write your code here

        Showtime FullMetallJacket = new Showtime(10, 16, "FullMetallJacket");
        Showtime Jojo = new Showtime(20, 20, "Jojo");

        SeatBooker Oleg = new SeatBooker("oleg", FullMetallJacket, new Seat[] {
                new Seat(1, 1),
                new Seat(1, 2),
                new Seat(1, 3),
                new Seat(1, 4),
                new Seat(5, 4),
                new Seat(6, 4),
                new Seat(7, 4),
                new Seat(8, 4),
        });

        SeatBooker Misha = new SeatBooker("Misha", Jojo, new Seat[] {
                new Seat(1, 1),
                new Seat(1, 20),
                new Seat(1, 14),
                new Seat(5, 4),
                new Seat(6, 4),
                new Seat(7, 4),
                new Seat(8, 4),
        });
        Thread t1 = new Thread(Oleg);
        Thread t2 = new Thread(Misha);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
