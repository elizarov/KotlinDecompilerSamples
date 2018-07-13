/**
 * Decompiler looses the body of lambda.
 *
 * https://youtrack.jetbrains.com/issue/IDEABKL-7385
 */
fun callIt() {
    callMe { println("Hello") }
}