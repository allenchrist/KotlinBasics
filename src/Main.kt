 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
   //object of the class
   var daisy=Dog("jimmy","lab",1)

   println("Summary")
   println("Name is ${daisy.name}")
   println("Breed is ${daisy.breed}")
   println("Age is ${daisy.age}")

   println()
   println("After one year")
   println()

   daisy.age=2 //reinilitiaze of the values in tha constructor
   println("Name is ${daisy.name}")
   println("Breed is ${daisy.breed}")
   println("Age is ${daisy.age}")
}

