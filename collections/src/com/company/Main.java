package com.company;
import java.util.*;

public class Main {
    public interface BlackListFilter{
        void filterComments(List<String> comments, Set<String> blacklist);
    }
    static class BlFilter implements BlackListFilter{
        @Override
        public void filterComments(List<String> comments, Set<String> blacklist) {
            boolean isDiff = Collections.disjoint(comments, blacklist);
            for (String s : comments){
                if (blacklist.contains(s)) {
                    System.out.println("комментарий заблокирован");
                }
                else {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        List comments = new ArrayList();
        comments.add("element 1");
        comments.add("element 2");
        comments.add("booba");
        comments.add("element 3");
        comments.add("Java");

        HashSet<String> blacklist = new HashSet<String>();
        blacklist.add("booba");
        blacklist.add("Java");


        BlFilter bl = new BlFilter();
        bl.filterComments(comments, blacklist);


    }
}
