public class AccMain{
	
	static int i = 10;
	
	public static void main(String args[]){
		System.out.println(i);
		System.out.println("Account.balance="+Account.balance);
		
		Account acc = new Account("00123-1200000",0.0);
		//類別  物件       建構子
		
		//acc.AccountNumber = "00123-1200000";
		acc.deposit(10000);
		
		System.out.println( "帳號："+acc.getAccountNumber() );
		System.out.println( "餘額："+acc.getBalance()       );
		
		Account acc2 = new Account("00123-1200001",0.0);
		
		//acc2.AccountNumber = "00123-1200001";
		acc2.deposit(1000);
		System.out.println( "帳號："+acc2.getAccountNumber() );
		System.out.println( "餘額："+acc2.getBalance()       );

		System.out.println( "帳號："+acc.getAccountNumber() );
		System.out.println( "餘額："+acc.getBalance()       );
		
		System.out.println("Account.balance="+Account.balance);
		System.out.println( Integer.MAX_VALUE );
		System.out.println( Integer.MIN_VALUE );
	}
}