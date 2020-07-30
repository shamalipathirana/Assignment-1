package scala_functions

class Account(id:String, n: Int, b: Double){

    val NIC:String = id
    val accNum: Int = n
    var accBalance: Double = b

    override def toString: String = "[" + NIC + ":" + accNum + ":" + accBalance + "]"

    def withdraw(a: Double): Unit = this.accBalance -= a   //assuming an account can have negative balances
    def deposit(a: Double): Unit = this.accBalance += a
    def transfer(acc: Account, b: Double) = {
      this.withdraw(b)
      acc.deposit(b)
    }
  }

object Question3
{
	def main(args:Array[String])
	{
	val b = new Account("967651451", 18001254, 35000)
  println("Account created -> "+ b.toString)
  b.deposit(5000)
  println("Credited 5000 to " + b.accNum + " -> " + b.toString)
  b.withdraw(2000)
  println("Debited 2000 from " + b.accNum + " -> " + b.toString)

  val c = new Account("647432187", 18001900, 20000)
  println("Account created -> " + c.toString)
  b.transfer(c,5000)
  println("Transferring 5000 from " + b.accNum + " to " + c.accNum + "...")
  println("Debited 5000 from " + b.accNum + " -> " + b.toString)
  println("Credited 5000 to " + c.accNum + " -> " + c.toString)
  println()
}
}
  
