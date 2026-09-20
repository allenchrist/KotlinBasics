var SEATS=MutableList(50){0}
class Booking (var NumberOfTickets:Int) {

    var MySeats = mutableListOf<Int>()
    fun seatselection()
    {
        println("Available Seats")
        for(i in 0..SEATS.size-1)
        {
            if(SEATS[i]==0) {
                println(i + 1)
            }
        }
        for(i in 1 .. NumberOfTickets)
        {
            println("Type Seat Number")
            var Selected=readln().toInt()
            if(SEATS[Selected-1]==0) {
                MySeats.add(Selected)
                SEATS[Selected - 1] = 1
            }
            else
            {
                println("Seat Already Selected")
            }
        }
    }
    fun BookingDetails()
    {
        println("Thank You For Booking")
        println("Your Seat Numbers are")
        for(i in MySeats)
        {
            println(i)
        }
    }


}