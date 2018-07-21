/*
	* Java program to demonstrate multithreading using runnable interface

*/
class RunnableThreadDemo implements Runnable{
	Thread t;
	RunnableThreadDemo(){
		//create new second thread
		t = new Thread(this,"Demo Thread");
		System.out.println("Child thread:= "+t);
		t.start();//start thread
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
class RunnableThread{
	public static void main(String[] args) {
		new RunnableThreadDemo(); // creates a new thread

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