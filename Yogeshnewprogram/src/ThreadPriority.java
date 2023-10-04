
class Test01 extends Thread
{@Override
public void run() {
	Thread.currentThread().setPriority(5);
	//System.out.println(Thread.currentThread().getPriority());
	for (int i=20;i>=1;i--) {
		System.out.println("Run:"+i);
	}
}
}
public class ThreadPriority{
	public static void main(String[] args) {
		//Thread.currentThread().setPriority(10);
		//System.out.println(Thread.currentThread().getPriority());
		Test01 pn = new Test01();
		pn.setPriority(10);
		pn.start();
		
		for (int i=1;i<=20;i++) {
			System.out.println("main:"+i);
		}
			
	}
}