package second

object One {
  def main(args:Array[String])
  {
  
   println("Enter your first number:")
   var A=scala.io.StdIn.readInt()
   println("Enter your first number:")
   var B=scala.io.StdIn.readInt()
   println("Enter your first number:")
   var C=scala.io.StdIn.readInt()
   if(A>B)
   {
     if(A>C)
     {
       println("A is the largest number")
       
     }
     else
     {
       println("C is the largest number")
     }
   }
   else
   {
     if(B>C)
     {
       println("B is the latgest numebr")
     }
     else{
       println("C is the largest number")
     }
   }
   
   
}
}