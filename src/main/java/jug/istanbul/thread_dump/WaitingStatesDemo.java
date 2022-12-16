package jug.istanbul.thread_dump;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class WaitingStatesDemo {
    public static void main(String[] args) throws IOException {
        Thread someThread = new ThreadA();
        someThread.start();
        //System.out.println(threadDump(true, true)); //-- RUNNABLE - TIMED_WAITING
        try {
            synchronized (someThread) {
                //System.out.println(threadDump(true, true)); // RUNNABLE - BLOCKED
                someThread.wait(); // for it to happen
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(threadDump(true, true)); // RUNNABLE - NULL
    }

    public static String threadDump(boolean lockedMonitors, boolean lockedSynchronizers) {
        StringBuffer threadDump = new StringBuffer(System.lineSeparator());
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        for (ThreadInfo threadInfo : threadMXBean.dumpAllThreads(lockedMonitors, lockedSynchronizers)) {
            threadDump.append(threadInfo.toString());
        }
        return threadDump.toString();
    }
}