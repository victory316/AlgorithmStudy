package com.example.algorithmstudy.java;

public class JavaStackUtil {

    /**
     * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
     */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) count++;
            }

            answer[i] = count;
        }


        return answer;
    }
}
