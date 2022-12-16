package jug.istanbul.jit;

import java.io.BufferedInputStream;
import java.lang.management.ManagementFactory;

public class TieredCompilation {

    public static void main(String[] args) throws Exception {
        System.out.println("starting...");
        for (int i = 0; i < 1_000_000; i++) {
            Formatter formatter;
            if (i < 500_000) {
                formatter = new JsonFormatter();
            } else {
                formatter = new XmlFormatter();
            }
            formatter.format(new Article("Tiered Compilation in JVM", "ING Tech"));
        }
        System.gc(); // git bir bak ve çöp olan nesne var mı yok mu?
        BufferedInputStream reader = new BufferedInputStream(System.in);
        System.out.println("Total Compilation time: " + ManagementFactory.getCompilationMXBean().getTotalCompilationTime() + "ms");

        reader.read();
        System.out.println("done");
    }

}