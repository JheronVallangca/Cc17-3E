fun main() {
    val age = 20*365
    val name = "Jheron Vallangca"
    val border = "===%%%"
    val timesToRepeat = 6
    
    printBorder(border,timesToRepeat)
    print("Happy Birthday! ${name}\n") 
    printBorder(border,timesToRepeat)
    print("I am ${age} days old\n")
    print("${age} days old is the best age to learn Kotlin!\n")
    print("${name} is already ${age} days old!\n")
    //Let's Print a cake
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
}
fun printBorder(border:String, timesToRepeat:Int){
    repeat(timesToRepeat){
    print(border)
    }
    println()
}
