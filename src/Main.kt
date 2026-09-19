//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Give number 1")
    var num1=readln().toFloat()
    println("Give number 2")
    var num2=readln().toFloat()

    print("The Added answer is ${add(num1,num2)}")
}
fun add(num1: Float, num:Float):Float{
    return (num1/num).toFloat()
}
