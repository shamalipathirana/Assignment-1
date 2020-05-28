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
    var best_price:Int=0;
   var max_profit=profit(best_price);
   var i:Int=0
   for(i <-0 to 45 by 5){
     if(max_profit<profit(i)){
       max_profit=profit(i);
       best_price=i;
     }
     
     
   }
   println("most suitable ticket price is = Rs." + best_price);
   println("Highest profit is= Rs." + max_profit);
 }
}
 

  