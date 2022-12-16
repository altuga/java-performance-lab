package jug.istanbul.thread_dump;

import java.util.ArrayList;
import java.util.List;

import static jug.istanbul.thread_dump.WaitingStatesDemo.threadDump;

public class ThreadA extends Thread {
    private List<Double> data = new ArrayList<>();
    @Override
    public void run() {
        synchronized (this) {
            try {
                //System.out.println(threadDump(true, true)); // -- WAITING - RUNNABLE
                sleep(5000);
                System.out.println(" --> " + threadDump(true, true)); // WAITING - RUNNABLE
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(threadDump(true, true));  // WAITING - RUNNABLE
            notify();
            //System.out.println(threadDump(true, true));  // BLOCKED - RUNNABLE
        }
    }
}
