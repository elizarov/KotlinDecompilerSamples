/**
 * Decompiling this function produces lots of references to
 * "<undefinedtype>", because state machine class was decompiled into
 * an anonymous inner class. Instead, the state machine class should
 * have been decompiled to a separate class, so that the decompiled
 * Java code is more readable.
 */
suspend fun foo1(): Int {
    bar()
    return 1
}