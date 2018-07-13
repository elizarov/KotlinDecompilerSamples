
suspend fun bar(): Int = 0

fun produce(): Int = 0
fun consume(x: Int, y: Int) {}

fun callMe(f: () -> Unit) = f()
