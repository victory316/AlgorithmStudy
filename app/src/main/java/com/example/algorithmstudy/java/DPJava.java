package com.example.algorithmstudy.java;

import java.util.Collections;

public class DPJava {

    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dpArray = new int[triangle.length][triangle[triangle.length - 1].length];
        int temp = 0;


        for (int i = 1; i < triangle.length; i++) {
            for (int j = 1; j < triangle[i].length; j++) {
                if (dpArray[i - 1][j - 1] > dpArray[i - 1][j]) {
                    temp = dpArray[i - 1][j - 1];
                } else {
                    temp = dpArray[i - 1][j];
                }

                dpArray[i][j] = temp + triangle[i][j];
            }
        }

        int max = -99999999;

        for (int i = 0; i < dpArray[dpArray.length - 1].length; i++) {
            if (dpArray[dpArray.length -1][i] > max) max = dpArray[dpArray.length -1][i];
        }

        return max;
    }
}
