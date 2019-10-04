package io.mine.ft.train.book_1.chapter_2.synchronized_method_lock_object;

/**
 * className MyObject
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:52
 */
public class MyObject {
    public synchronized void methodA() {
        try {
            System.out.println("begin method A thread name = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        try {
            System.out.println("begin method B thread name = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
