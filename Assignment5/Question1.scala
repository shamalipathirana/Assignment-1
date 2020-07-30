package scala_functions


object Question1 {
  class rationalNum(n:Int,d:Int)
{
	require(d>0,"denominator must be greater than zero");
    def numer=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def neg=new rationalNum(-this.numer,this.denom);
    override def toString= numer+"/"+denom;
}

	def main(args:Array[String])
	{
		
		val rat1=new rationalNum(2,4);
		val rat2=rat1.neg
		println("Number   : "+rat1);
		println("Negetion : "+rat2);

		}


}