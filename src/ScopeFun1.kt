
class Scope1 {
    var x: Int? = 0

    /**
     * When this code is decompiler the resulting Java code looks as if variable x is being read
     * twice, while, in fact, in bytecode x field is read only once.
     */
    fun foo() {
        x?.let { print(it) }
    }
}