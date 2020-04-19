package io.mine.ft.train.book_3.chapter_9.test_4.task;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTaskA extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Integer compute() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin A "
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + "   end A "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 100;
	}

}
