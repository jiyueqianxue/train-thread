package io.mine.ft.train.book_1.chapter_2.double_syn_block_one_two;

/**
 * className ObjectService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午12:32
 */
public class ObjectService {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A   end time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time = " + System.currentTimeMillis());
            System.out.println("B   end time = " + System.currentTimeMillis());
        }
    }
}
