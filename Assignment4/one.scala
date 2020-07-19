package second

//Implement Encryption and Decryption functions of Caesar cipher.

object One {
  def main(args:Array[String])
  {
  val alphabet:String="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  println("Enter your text(A string of lower case letters,called text):")
  val text=scala.io.StdIn.readLine()
  println("Enter your shift(An integer between 0-25 denoting the required shift):")
  val n=scala.io.StdIn.readInt()
  
  val Encrypt=(c:Char,shift:Int,a:String)=>a((a.indexOf(c.toUpper)+shift)%a.size)
  val Decrypt=(c:Char,shift:Int,a:String)=>a((a.indexOf(c.toUpper)-shift+a.size)%a.size)
  val cipher=(algo:(Char,Int,String)=>Char,s:String,shift:Int,a:String)=>s.map(algo(_,shift,a))
  
  val Encrypt_text=cipher(Encrypt,text,n,alphabet)
  val Decrypt_text=cipher(Decrypt,Encrypt_text,n,alphabet)
  println("Text:" + text)
  println("Encrypt Text:" +Encrypt_text)
  println("Decrypt Text:" +Decrypt_text)
  }
  
}