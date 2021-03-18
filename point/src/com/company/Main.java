package com.company;
import java.util.Scanner;

public class Main {

    static class Point{

       public static double a;
       public static double b;
       public static double c;

        public double poluPm(){
            double p = (a + b + c)/2;
            return p;
        }
        public double Geron(){
            double p = poluPm();
            double g = Math.sqrt(p * (p-a)*(p-b)*(p-c) );
            return g;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Point Find = new Point();

        System.out.print("a = ");
        Point.a = in.nextDouble();

        System.out.print("b = ");
        Point.b = in.nextDouble();

        System.out.print("c = ");
        Point.c = in.nextDouble();

        System.out.println("Результат " + Find.Geron());


    }
}
