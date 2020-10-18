package com.example.algorithmstudy.java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSolution {

    public int solution(int stock, int[] dates, int[] supplies, int k) {

        int supplyCount = 0;
        int currentStock = stock;
        Queue<int[]> datesQueue = new LinkedList<>();


        for (int i = 0; i < dates.length; i++) {
            datesQueue.offer(new int[]{dates[i], supplies[i]});
        }
        for (int date = 1; date <= k; date++) {
            currentStock--;

            if (datesQueue.size() == 0) break;

            System.out.println("peek : " + datesQueue.peek()[0] + " | date : " + date);

            if (datesQueue.peek()[0] == date) {
                System.out.println("remain : " + (k - date + 1) + " stock : " + currentStock);
                if (k - date + 1 > currentStock) {
                    currentStock += datesQueue.poll()[1];
                    supplyCount++;
                }

                System.out.println("after remain : " + (k - date + 1) + " stock : " + currentStock);
            }
        }

        return supplyCount;
    }
}
