fun main()
{
   //immutablelist

   val numbers1=listOf(4,2,3,4,5)

   //mutable list

   var numbers=mutableListOf("one","Two","Three","four","five","six")
   println(numbers)

   //add methods

   numbers.add("Seven")
   numbers.add(0,"Zero")
   println(numbers)

   //size function

   var sizeoflist=numbers.size
   println(sizeoflist)

   //remove methods

   numbers.remove("one")
   numbers.removeAt(0)
   println(numbers)
   sizeoflist=numbers.size
   println(sizeoflist)

   //contains

   if(numbers.contains("one"))
      println("There is number one in the list")
   else
      println("There is NO number one in the list")

   //set method to modify element at particular index

   numbers.set(0,"Zero")
   println(numbers)
   println()


   //FOR LOOPS


   for(items in numbers)
   {
      println(items)
   }

   //index in for lool
   for(i in 0..numbers.size)
      println(i)

   for(i in 0 until numbers.size)
      println(numbers[i])
}