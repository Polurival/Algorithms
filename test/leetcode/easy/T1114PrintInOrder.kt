package leetcode.easy

import java.util.concurrent.Semaphore

/**
 * @author Польщиков Юрий on 21/01/2021
 */
internal class T1114PrintInOrder {

    val semaphore2 = Semaphore(0)
    val semaphore3 = Semaphore(0)

    @Throws(InterruptedException::class)
    fun first(printFirst: Runnable) {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run()
        semaphore2.release()
    }

    @Throws(InterruptedException::class)
    fun second(printSecond: Runnable) {
        semaphore2.acquire()
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run()
        semaphore3.release()
    }

    @Throws(InterruptedException::class)
    fun third(printThird: Runnable) {
        // printThird.run() outputs "third". Do not change or remove this line.
        semaphore3.acquire()
        printThird.run()
    }
}

fun main() {
    val foo = T1114PrintInOrder()
    Thread { foo.first { println("first") } }.start()
    Thread { foo.second { println("second") } }.start()
    Thread { foo.third { println("third") } }.start()
}