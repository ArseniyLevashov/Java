package com.company;

import java.util.*;

public class BLfilter implements Main.BlackListFilter {



    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        System.out.println("Перебор массива");

        for (int i = 0; i < comments.size(); i++){
            for (int j = 0; j < blackList.size(); j++) {

                if (i == j) {
                    comments.remove(j);
                }
            }
    }
        System.out.println("Фильтрованное значение:");
        System.out.println(comments);
}}