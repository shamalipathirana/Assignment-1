package second

object Q1 {
  def main(args:Array[String]){
    printf("Enter your number:")
    var n=scala.io.StdIn.readInt()
    println(prime(n))
   
        
  }
    def prime(n:Int,i: Int=2):Boolean=n match{
    case n if(n<2)=>false
    case n if(n==2)=>true
    case n if(n%i==0)=>false
    case n if(i*i>n)=>true
    case _ =>prime(n,i+1)
}
}

