import java.util.*

object Program {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val x = scanner.nextInt()
        val str = scanner.nextLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    }
}