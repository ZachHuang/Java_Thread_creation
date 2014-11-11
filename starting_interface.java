package starting_threading;
class Runner_interface implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("Hello"+i);		
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	
	
}
public class strating_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread T1 = new Thread(new Runner_interface());
		Thread T2 = new Thread(new Runner_interface());
		T1.start();
		T2.start();
	}

}
