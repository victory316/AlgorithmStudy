package com.example.algorithmstudy.java;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueUtil {


    /**
     * 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해
     * Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.
     * <p>
     * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
     * <p>
     * Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
     * Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로
     * 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
     *
     * @return
     */
    public int doSkovile(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> finishedMix = new ArrayList<>();

        int mixCount = 0;

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
            System.out.println("adding " + scoville[i]);
        }

        while (!priorityQueue.isEmpty()) {
            if (priorityQueue.peek() < K && priorityQueue.size() != 1) {
                System.out.println("smaller than " + K + " | " + priorityQueue.peek());

                int mixedResult = priorityQueue.poll() + priorityQueue.poll() * 2;
                priorityQueue.add(mixedResult);

                if (mixedResult >= K) finishedMix.add(mixedResult);

                mixCount++;
            } else if (priorityQueue.peek() > K){
                finishedMix.add(priorityQueue.poll());
            } else {
                priorityQueue.poll();
            }
        }

        for (int i = 0; i < finishedMix.size(); i++) {
            System.out.println("item : " + finishedMix.get(i));
        }

        if (finishedMix.size() == 0) {
            return -1;
        } else {
            return mixCount;
        }
    }
}
