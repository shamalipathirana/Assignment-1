package pure_functions;

object Assignment2_Q2 {
  def attendees(T_price:Int):Int=
    120+(15-T_price)/5*20
    //calculate the number of attendees by giving the ticket price
  def revenue(T_price:Int):Int=
    attendees(T_price)*T_price
  //calculate the revenue by giving the ticket price
  def cost(T_price:Int):Int=
    500+3*attendees(T_price)
    //calculate the cost by giving the ticket price
  def profit(T_price:Int):Int=
    revenue(T_price)-cost(T_price)
    //calculate the profit by giving the ticket price
   def main(args:Array[String]){
    println("profit by giving the ticket price is Rs.5= "  +profit(5))
    println("profit by giving the ticket price is Rs.10= "  +profit(10))
    println("profit by giving the ticket price is Rs.15= "  +profit(15))
    println("profit by giving the ticket price is Rs.20= "  +profit(20))
    println("profit by giving the ticket price is Rs.25= "  +profit(25))
    println("profit by giving the ticket price is Rs.30= "  +profit(30))
    println("profit by giving the ticket price is Rs.35= "  +profit(35))
    println("profit by giving the ticket price is Rs.40= "  +profit(40))
    println("profit by giving the ticket price is Rs.45= "  +profit(45))
  }
}