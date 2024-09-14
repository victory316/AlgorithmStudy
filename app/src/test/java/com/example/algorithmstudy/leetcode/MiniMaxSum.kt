import kotlinx.coroutines.Dispatchers
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    val map = mutableMapOf<Int, Int>()

    Dispatchers.IO
    Dispatchers.Main
    Dispatchers.Default

    return map.entries.find { it.value == 1 }?.value ?: 0
}

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val min = arr.sorted().subList(0, 4).sum()
    val max = arr.sorted().subList(1, 5).sum()

    print("$min, $max")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
