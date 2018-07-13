/**
 * This function cannot be decompiled at all (shows: "Cannot decompile").
 */
suspend fun foo3(): Int {
    try {
        val x = bar()
        if (x == 0) return 0
    } finally {
        bar()
    }
    return 1
}