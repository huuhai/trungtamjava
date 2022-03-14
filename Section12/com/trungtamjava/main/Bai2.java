package com.trungtamjava.main;

import com.trungtamjava.exception.ZeroException;

public class Bai2 {

	public static void main(String[] args) {
		try {
			chia2So(10, 0);
		} catch (ZeroException e) {
			System.out.println(e.getError());
		}

	}

	public static void chia2So(int a, int b) throws ZeroException {
		try {
			int kq = a / b;
			System.out.println(kq);
		} catch (Exception e) {
			//e.getStackTrace();
			throw new ZeroException("fail : " + e);
		}
	}
}
