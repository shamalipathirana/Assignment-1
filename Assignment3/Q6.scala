package second

object Q6 {
  def fibonacci(n:Int) :Int =n match{
    case 0 => 0
    case n if (n==1) => 1
    case n => fibonacci(n-1)+fibonacci(n-2)
  }
  def fibonacci_Seq(n:Int):Unit=  {
    if(n>=0){
      fibonacci_Seq(n-1)
    
     println(fibonacci(n))
   }
  }
  def main(args:Array[String]){
  println("Enter your n:")
  var n=scala.io.StdIn.readInt()
  println("Fibonacci sequence :")
  fibonacci_Seq(n)
  }
  
}