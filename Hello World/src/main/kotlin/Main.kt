fun main() {
    println("Hello, World!")

    printFun();
    printFun("passed")

    println("Hello, ${returnFun()}")
}

fun printFun(passed: String = "Default"){
    println("Hello, $passed");
}

fun returnFun(): String{
    return("return!")
}