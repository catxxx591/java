//類別宣告
public class Account{
	//屬性宣告
	private String AccountNumber; //帳號
	static double balance; //存款金額
	
	//建構子宣告
	Account(String AccountNumber, double balance){
		this.AccountNumber = AccountNumber;
		//this.balance = balance;
		//System.out.println("建構子被呼叫!!");
	}
	
	//方法宣告
	String getAccountNumber(){
		return AccountNumber;
	}//get取得  set設定
	double getBalance(){
		return balance;
	}
	void deposit(int balance){
		this.balance += balance;
		//這個類別的
	}
	void withdraw(int balance){
		this.balance -= balance;
	}
}