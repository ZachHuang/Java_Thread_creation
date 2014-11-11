
import java.util.Scanner;

class Processor extends Thread{
	private volatile boolean running = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		while(running){
			System.out.println("continue");
		}
		
	}
	public void shutdown(){
		running = false;
	}
	
}

public class Thread_Synchronization {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor proc1 = new Processor();
		proc1.start();
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		proc1.shutdown();
	}

}
