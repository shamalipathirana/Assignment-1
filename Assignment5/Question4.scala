package scala_functions

class account(id:String,aNumber:Int,balance:Double)
{
	var NIC=id;
	var accNum=aNumber;
	var accBalance=balance;
}

object Question4
{
	def main(args:Array[String])
	{
		
		println("  Overdraft-Total Balance-Interest")

		var acc1=new account("967651451",202137,35000);
		var acc2=new account("987123457",237823,20000);
		var acc3=new account("952854310",198367,40000);
		var acc4=new account("926541291",184562,-2000);
		var acc5=new account("966474213",195632,-10000);
		var acc6=new account("957651254",294564,0);
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6);
		
		//Overdraft account numbers
		println("Overdraft account numbers   : ");
		var odlist=overdraft(bank);
		odlist.foreach(x=>print(x.accNum+"   "));

		//Total account balance
		var totBalance=balance(bank);
		println("Total account balance  : "+totBalance.accBalance);

		//Account balance after adding Balance-Interest
		println("Account balances + interest : ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));

		
	}

	val overdraft=(list:List[account])=>list.filter(x=>x.accBalance<=0);
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("945178237",1000,x.accBalance+y.accBalance));
	val interest=(list:List[account])=>list.map(x=>(if(x.accBalance>0) x.accBalance*1.05d else x.accBalance*1.01d));
}