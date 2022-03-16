package com.trungtamjava.main;

import com.trungtamjava.MyThread;

public class Main1 {

	public static void main(String[] args) {

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			threads[i] = new MyThread();
		}

		for (Thread thread : threads) {
			thread.start();
			
		}
	}

}
