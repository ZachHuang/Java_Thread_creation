package mulitiple_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class multiple_locks {
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 =new ArrayList<Integer>();
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private Random random = new Random();
	public void stageOne(){
		synchronized (lock1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));	
		}
		
	}
	public void stageTwo(){
		synchronized (lock2) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));	
		}
		
	}
	public void process(){
		for(int i=0; i<100;i++)
		{
			stageOne();
			stageTwo();
		}
	}
	
	public void main() {
		// TODO Auto-generated method stub
		System.out.println("Starting....");
		long start = System.currentTimeMillis();
		Thread T1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
			process();	
			}
						
		});
		Thread T2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
			process();	
			}
						
		});
		T1.start();
		T2.start();
		
		long end = System.currentTimeMillis();
		System.out.println("Time takes"+ (end-start));
		System.out.println("List1 size:"+ list1.size()+"List2: "+list2.size());
		
	}

}
