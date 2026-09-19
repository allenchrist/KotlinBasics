
class Dog (var name:String,var breed:String,var age:Int=0) {
    //will act as a default constructor
    init {

        printnameandbreed()
        bark()

    }
    fun printnameandbreed()
    {
        println("The name of the dog is $name and breed is $breed and age is $age")
    }
    fun bark()
    {
        println("WOOF WOOF")
    }

}