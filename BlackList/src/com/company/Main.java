package com.company;

import java.util.*;

public class Main {

    public interface BlackListFilter{
        void filterComments(List<String> comments, Set<String> blackList);
    }

    public static void main(String[] args) {

        List<String> comments = new ArrayList<String>();
        Collections.addAll(comments, "oga", "boga", "shoga");

        Set<String> blackList = new HashSet<String>();
        Collections.addAll(blackList, "boga");

        BLfilter Oga = new BLfilter();
        Oga.filterComments(comments, blackList);
    }
}
