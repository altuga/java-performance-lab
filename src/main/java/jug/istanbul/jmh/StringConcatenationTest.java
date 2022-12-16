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
public class StringConcatenationTest {

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(StringConcatenationTest.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }

    @Benchmark
    public void testStringAdd(Blackhole bh) {
        int count = 100000;
        String str = "";
        for (int i = 0; i < count; i++) {
            str = str + "core"; // String concatenation
        }
    }

    @Benchmark
    public void testStringBuffer(Blackhole bh) {
        int count = 100000;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            stringBuffer.append("core");
        }
    }
}
