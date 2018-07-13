

object Synchronized1 {
    /**
     * Decompiled code for this function has an empty `synchronized(this) {}` block, instead of
     * wrapping `println` invocation.
     *
     * https://youtrack.jetbrains.com/issue/IDEABKL-7548
     */
    fun test() {
        synchronized(this) {
            println("Boom")
        }
    }
}