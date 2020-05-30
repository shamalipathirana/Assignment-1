package second

object Qu5 {
  def sumOfEven(n:Int):Int=n match{
    case n if(n<1)=>n
    case n if(n%2==0)=>(n-2)+sumOfEven(n-2)
    case n if(n%2==1)=>(n-1)+sumOfEven(n-1)
  }
  def main(args:Array[String]){
    println("Enter your n:")
    var n=scala.io.StdIn.readInt()
    println("sum of all even numbers less than " +n+ "=" + sumOfEven(n))
  }
}
