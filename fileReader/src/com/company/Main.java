package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Введите полный адрес файла:");

        Scanner in = new Scanner(System.in);
        String ex = in.nextLine();
        in.close();

        File file = new File(ex);
        Scanner sc;

        try {
            sc = new Scanner(file);

            Pattern p = Pattern.compile("[//].*");

            while (sc.hasNextLine()) {
                if (sc.hasNext(p)) System.out.println(sc.nextLine());
                else sc.next();
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
