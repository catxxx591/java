//public final class TestFinal{
public class TestFinal{
	//final int i = 10;
	int i = 10;

	//final void test(){
	void test(){
		int j =30;
		i = 20;
	}
}

class F extends TestFinal{
	void test(){
	}
}