//���O�ŧi
public class Account{
	//�ݩʫŧi
	private String AccountNumber; //�b��
	static double balance; //�s�ڪ��B
	
	//�غc�l�ŧi
	Account(String AccountNumber, double balance){
		this.AccountNumber = AccountNumber;
		//this.balance = balance;
		//System.out.println("�غc�l�Q�I�s!!");
	}
	
	//��k�ŧi
	String getAccountNumber(){
		return AccountNumber;
	}//get���o  set�]�w
	double getBalance(){
		return balance;
	}
	void deposit(int balance){
		this.balance += balance;
		//�o�����O��
	}
	void withdraw(int balance){
		this.balance -= balance;
	}
}