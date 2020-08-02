package com.example.algorithmstudy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GreedyJava {
    public int solution(int[] people, int limit) {
        int answer = 1;
        ArrayList<Integer> peopleList = new ArrayList<>();

        for (int i = 0; i < people.length; i++) {
            peopleList.add(people[i]);
        }

        Collections.sort(peopleList);

        int boatCapacity = 0;

        for (int i = 0; i < peopleList.size(); i++) {

            if (boatCapacity + peopleList.get(i) <= limit) {
                boatCapacity += peopleList.get(i);
            } else {
                answer++;
                boatCapacity = 0;
                boatCapacity += peopleList.get(i);
            }

//            System.out.println("boat capacity : " + boatCapacity + " | people : " + peopleList.get(i));
        }

//        if (boatCapacity != 0) answer++;

        return answer;
    }
}
