
/**
 * Decompiler hangs here.
 *
 * https://youtrack.jetbrains.com/issue/IDEABKL-7553
 */
val sl2: suspend () -> Unit = {
    bar()
    println("SL1")
}