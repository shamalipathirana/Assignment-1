package second

object Q4 {
  def isEven(n:Int):Boolean= n match{
    case 0=> true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean= !(isEven(n))
  def main(args:Array[String]){
    println("Enter your number:")
    var n=scala.io.StdIn.readInt()
    println("The number you entered is Even number :this statement is "+ isEven(n))
  }
}