fun main() {
    var name: String = "Luis"; // mutable variable
    val age: Int = 21; // immutable variable
    var height: Double = 1.75; // mutable variable
    var weight: Float = 69.5f; // mutable variable
    var isStudent: Boolean = true; // mutable variable
    var biograph: Long = 123456789; // mutable variable
    var address: Char = 'A'; // mutable variable
    var x: Short = 1; // mutable variable
    var y: Byte = 0xf; // mutable variable 'using hexadecimal'
    var z: UInt = 1u; // mutable variable 'using unsigned integer'

    print("Types of variables:\n")

    print("Name: $name\nAge: $age\nHeight: $height\nWeight: $weight\nIs Student: $isStudent\nBiograph: $biograph\nAddress: $address\nX: $x\nY: $y\nZ: $z")
}