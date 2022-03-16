package com.trungtamjava.model;

public class Ticket implements Runnable {

	private int ticket = 2;

	public synchronized void buyTicket() {
		try {
			ticket = ticket - 1;
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(3000);

			if (ticket > 0) {
				System.out.println("Can buy");
			} else {
				System.out.println("Out of ticket");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void run() {
		buyTicket();
	}
}