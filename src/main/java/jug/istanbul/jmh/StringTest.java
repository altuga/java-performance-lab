package jug.istanbul.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 3)
@Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
public class StringTest {

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(StringTest.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }

    @Benchmark
    public void testIntern(Blackhole bh) {
        for (int i = 0; i < 100000; i++) {
            String s = new String("String to intern " + i);
            String t = s.intern();
            bh.consume(t);
        }
    }

    @Benchmark
    public void testIntern2(Blackhole bh) {
        for (int i = 0; i < 100000; i++) {
            String s = "String to intern " + i;
            bh.consume(s);
        }
    }
}
