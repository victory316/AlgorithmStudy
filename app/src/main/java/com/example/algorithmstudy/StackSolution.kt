package com.example.algorithmstudy

import java.util.*

class StackSolution {

    /**
     * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
    ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
    예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
    경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
    0	[]	[]	[7,4,5,6]
    1~2	[]	[7]	[4,5,6]
    3	[7]	[4]	[5,6]
    4	[7]	[4,5]	[6]
    5	[7,4]	[5]	[6]
    6~7	[7,4,5]	[6]	[]
    8	[7,4,5,6]	[]	[]
    따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
    solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
     */

    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val truckQueue: Queue<Int> = LinkedList()
        val bridgeQueue: Queue<Truck> = LinkedList()

        truck_weights.toCollection(truckQueue)

        var answer = 0

        while (truckQueue.isNotEmpty() || bridgeQueue.isNotEmpty()) {

            if (bridgeQueue.size != 0) {

                bridgeQueue.forEach {
                    it.progress++
                }

                if (bridgeQueue.peek()?.progress == bridge_length) {
                    bridgeQueue.poll()
                }
            }

            truckQueue.peek()?.let {

                if (bridgeQueue.map { truck -> truck.truckWeight }.sum() + it <= weight) {
                    bridgeQueue.offer(Truck(truckQueue.poll()!!, 0))
                }
            }

            answer++
        }

        return answer
    }

    data class Truck(val truckWeight: Int, var progress: Int)


    /**
     * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
    또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
    먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
    제한 사항
    작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
    작업 진도는 100 미만의 자연수입니다.
    작업 속도는 100 이하의 자연수입니다.
    배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
     */
    fun improvementTest(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = ArrayList<Int>()

        val queue: Queue<Int> = LinkedList()

        for (index in progresses.indices) {
            val amountToFinish = 100 - progresses[index]

            if (amountToFinish % speeds[index] != 0) {
                queue.offer(amountToFinish / speeds[index] + 1)
            } else {
                queue.offer(amountToFinish / speeds[index])
            }

        }

        var dateCount = 1
        var releaseCount = 0

        while (queue.size != 0) {
            if (queue.peek() == dateCount) {
                while (queue.size > 0 && queue.peek() <= dateCount) {

                    queue.poll()
                    releaseCount++
                }

                answer.add(releaseCount)
            }

            releaseCount = 0

            dateCount++
        }

        return answer.toIntArray()
    }
}