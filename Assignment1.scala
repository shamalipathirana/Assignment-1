package first;

object Assignment1 {
  def fahrenheit(c:Int):Double={
   (c*1.8)+32
  }
  def volume(r:Int):Double={ 
   (4.0/3.0)*math.Pi*r*r*r
  }
  
    def copies(x:Int):Double={
    ((x*24.95*0.4)+(3*x+(x-50)*0.75))/*The total wholesale cost for 60 books=
    * books_price_discount(60)+shipping_cost(60)
    */
      
  }
  def main(args:Array[String])={
    println("35 Celsius in Fahrenheit:" + fahrenheit(35));
    println("Volumn of sphere with radius r is 5  :" + volume(5));
    println("Total wholesale cost for 60 copies:" + copies(60));  
    }
}
  
  