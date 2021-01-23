package concurrency

import java.util.concurrent.atomic.AtomicBoolean
import kotlin.concurrent.thread

/**
 * Научите ходить "по-человечески" робота: шаги правой и левой ногой строго по очереди
 * (с какой ноги начать - не важно))
 *
 * @author Польщиков Юрий on 20/01/2021
 */
class Foot(
    private val name: String,
    private val flag: AtomicBoolean
) : Runnable {

    override fun run() {
        while (true) {
            if (!flag.get() && name == "left") {
                step()
                flag.set(true)
            }
            if (flag.get() && name == "right") {
                step()
                flag.set(false)
            }
        }
    }

    private fun step() {
        println("step by $name")
    }
}

class Robot {
    fun start() {
        val flag = AtomicBoolean(false)

        thread { Foot("left", flag).run() }
        thread { Foot("right", flag).run() }
    }
}

fun main(args: Array<String>) {
    Robot().start()
}