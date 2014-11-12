package starting_threading;

public class Synchronized_keyword {
	private int count =0;
	public synchronized void counter(){
		count++;	
	}
	public void dowork(){
		Thread T1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++){
					counter();
				}
			}
			
		});
		Thread T2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++){
					counter();
				}
			}
			
		});
		T1.start();
		T2.start();
		try {
			T1.join();
			T2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronized_keyword sk = new Synchronized_keyword();
		sk.dowork();
	}
}
