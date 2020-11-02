package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        System.out.println("Введите адрес файла: ");
        Scanner path = new Scanner(System.in);
        String s;
        s = path.nextLine();

        File x = new File(s);
        Scanner in = new Scanner(x);

        Pattern p = Pattern.compile("[//].*");
        Pattern g = Pattern.compile("/[*] (.*?)/",
                Pattern.MULTILINE);

        while(in.hasNextLine()){
            String str = in.findInLine(p);
            String str2 = in.findInLine(g);
            if(str != null){
                System.out.println(str);
            }
            else if (str2 != null){
                System.out.println(str2);}
            in.nextLine();
        }

        in.close();
    }

}
