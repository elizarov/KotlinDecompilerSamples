/**
 * This is an example of Kotlin spilling stack into an unnamed local variable.
 */
fun main(args: Array<String>) {
    var a = 0
    val b = listOf(1, 3)
    consume(produce(), b.sumBy { it })
}