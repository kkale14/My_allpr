package htpsrv;


class Mythmthd implements Runnable{

	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println(e);
			}
		}
		}
		
	}
	
	
	



public class Mythm {
	
	

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Mythmthd());
		
		Thread t2 = new Thread(new Mythmthd());
		
		t1.start();
		t2.start();
		
	}

}
