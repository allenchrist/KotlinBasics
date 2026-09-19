//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Enter your name: ")
    var CustomerName=readln()
    println("Enter Number of Spoons of Sugar")
    var Sugar=readln().toInt()
    makeCoffee(CustomerName,Sugar)
    }
fun makeCoffee(name: String,Sugar:Int)
{
    println("The coffer is for $name with $Sugar Spoons of Sugar")
}