
suspend fun bar(): Int = 0

fun callMe(f: () -> Unit) = f()
