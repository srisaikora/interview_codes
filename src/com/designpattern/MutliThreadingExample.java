package com.designpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Hello extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hi implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class MutliThreadingExample {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Hello();
		Hi obj1 = new Hi();
		Thread t2 = new Thread(obj1);
		Runnable t3 = () -> {
			System.out.println("Thread t3");
		};
		t1.start();
		t1.join();
		t2.start();
		new Thread(t3).start();
		 // Create a fixed-size thread pool with 4 threads
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit tasks to the executor
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executor.execute(() -> {
                System.out.println("Task " + taskNumber + " executed by thread " + Thread.currentThread().getName());
                try {
        
                	Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            });
        }

        // Shutdown the executor after 1200 mills seconds
        if (!executor.awaitTermination(1200, TimeUnit.MILLISECONDS)) {
        	//ShutdownNow will stop the executor service immediately
        	executor.shutdownNow();
        } 
		
	}

}
