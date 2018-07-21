/*
	* Java program to demonstrate multithreading by extending Thread class

*/
class ExtendingThreadDemo extends Thread{
	
	ExtendingThreadDemo(){
		super("Demo Thread");
		System.out.println("Child thread := "+ this);
		start();
	}
	//entry point for second thread
	public void run(){
		try{
			for(int i = 5; i >= 0; i --){
				System.out.println("Child Thread := "+i);
				Thread.sleep(500); 
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}
	
}
class ExtendingThread{
	public static void main(String[] args) {
		new ExtendingThreadDemo(); // creates a new thread

		try{
			for (int i = 5;i >= 0 ;i-- ) {
				System.out.println("Main Thread := "+i);
				Thread.sleep(1000);	
			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exiting main thread");
	}
}