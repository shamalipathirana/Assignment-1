package second;

object Q3 {
  def main(args:Array[String]){
    println("Enter your n:" )
    var n=scala.io.StdIn.readInt()
    println(sum(n))
    
  }
  def sum(n:Int):Int={
   
    if(n==1)
      1
    else
     sum(n-1)+n
    }
  
} 
