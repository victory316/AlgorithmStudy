package com.example.algorithmstudy

import com.example.algorithmstudy.algorithm.BFS
import com.example.algorithmstudy.algorithm.DFS
import com.example.algorithmstudy.datastructure.StackSolution
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AlgorithmTest {

    @Test
    fun testBFS() {
        val bfs = BFS()

        val inputArray: ArrayList<Array<Char>> = arrayListOf(
            arrayOf('A', 'B', 'C'),
            arrayOf('B', 'A', 'D'),
            arrayOf('C', 'A', 'G', 'H', 'I'),
            arrayOf('D', 'B', 'E', 'F'),
            arrayOf('E', 'D'),
            arrayOf('F', 'D'),
            arrayOf('G', 'C'),
            arrayOf('H', 'C'),
            arrayOf('I', 'C', 'J'),
            arrayOf('J', 'I')
        )

        bfs.doBfs(inputArray)
    }

    @Test
    fun testDFS() {
        val dfs = DFS()

        val inputArray: ArrayList<Array<Char>> = arrayListOf(
            arrayOf('A', 'B', 'C'),
            arrayOf('B', 'A', 'D'),
            arrayOf('C', 'A', 'G', 'H', 'I'),
            arrayOf('D', 'B', 'E', 'F'),
            arrayOf('E', 'D'),
            arrayOf('F', 'D'),
            arrayOf('G', 'C'),
            arrayOf('H', 'C'),
            arrayOf('I', 'C', 'J'),
            arrayOf('J', 'I')
        )

        dfs.doDFS(inputArray)
    }

    @Test
    fun testDivider() {
        SumOfDividers().solution(12)
    }

    @Test
    fun CollectionTest() {
        SumOfDividers().dropMinValue(intArrayOf(4,3,2,1)).forEach {
            print("$it ")
        }
    }

    @Test
    fun StringTest() {
        StringUtil().arrangeString("aicndi").forEach {
            print("$it")
        }

        println(StringUtil().makeWeirdString("try hello world"))
    }

    @Test
    fun checkNumberTest() {
        println(StringUtil().checkIsDigit("0000000"))
    }

    @Test
    fun doCesar() {
        println(StringUtil().doCecar("a B z", 4))
    }

    @Test
    fun checkCollatz() {
        println(StringUtil().collatz(79999999))
    }

    @Test
    fun checkSumBetweenNumber() {
        println(StringUtil().sumBetweenNumber(3,15))
    }

    @Test
    fun checkString() {
//        println(StringUtil().solution("3people unFollowed me"))
//        println(StringUtil().solution("3"))
//        println(StringUtil().solution("1a"))
//        println(StringUtil().solution("a"))
//        println(StringUtil().solution("A kdnkEen 3333FonernE EEoeno"))
        println(StringUtil().solution("      1i anti ELNflkoif EnKei"))
        println(StringUtil().solution("3People and thRee pEoPlE"))


    }

    @Test
    fun truckTest() {
        println("result : ${StackSolution()
            .solution(2 ,10, intArrayOf(7,4,5,6))}")
//        println("result : ${StackSolution().solution(100 ,100, intArrayOf(10))}")
    }

    @Test
    fun cutAndArrangeTest() {
        println(StringUtil().cutAndArrange("aaa bbbbbb cccdd", 4))
        println(StringUtil().cutAndArrange("X", 4))
    }

    @Test
    fun fibonacciTest() {
        CalculatorUtil().divideFibonacci(3)
    }
}
