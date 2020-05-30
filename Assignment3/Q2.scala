package second;

object Q2 {
  def main(args:Array[String]):Unit={
  printf("Enter your number:")
  var n=scala.io.StdIn.readInt()
  println("List of prime numbers:")
  println(primeSeq(n))
  }
  def isPrime(n:Int,i:Int=2):Boolean=i match{
    case y if(n==y) =>  true
    case y if(n%y==0) => false
    case y =>isPrime(n,y+1)
  }
  def primeSeq(n:Int):Any={
    if(n==1)
      return 1
    else if(isPrime(n)==true){
      println(n);
      primeSeq(n-1)
      }
    else
        primeSeq(n-1)
      
    }
      
  
}