package pure_functions;

object Assignment2_Q1{
  def wage(x:Int)=
    x*150
  def ot(y:Int)=
    y*75
  def income(x:Int,y:Int)=
   wage(40)+ot(20)
  def tax(income:Int)=
    0.1*income
  def takehome(x:Int,y:Int):Double={
    income(40,20)-tax(income(40,20))
  }
  
  def main(args:Array[String]){
    println("Take home salary of an employee=Rs." + takehome(40,20))
  }
}

   

  
