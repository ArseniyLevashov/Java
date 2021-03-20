package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите полный адрес файла:");
        
        Scanner in = new Scanner(System.in);
        String ex = in.nextLine();
        in.close();

        File file = new File(ex);
        Scanner sc;

        int count = 0;

        try {
            sc = new Scanner(file);

            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Количество слов в файле:");
        System.out.println(count);
    }
}
