//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    var userinput=""
    println("Write and option ROCK OR PAPER OR SCISSOR")
    userinput=readln()

    var choice=(1..3).random()

    var computerinput=""

    when(choice)
    {
        1->{computerinput="ROCK"}
        2->{computerinput="PAPER"}
        3->{computerinput="SCISSOR"}
    }
    var winner=when
    {
        userinput==computerinput->"TIE"
        userinput == "ROCK" && computerinput == "SCISSOR" -> "USER"
        userinput == "PAPER" && computerinput == "ROCK" -> "USER"
        userinput == "SCISSOR" && computerinput == "PAPER" -> "USER"
        else -> "COMPUTER"
    }

    if(winner=="TIE")
        println("GAME IS TIE")
    else if(winner=="USER")
        println("USER WINS")
    else
        println("COMPUTER WINS")

}