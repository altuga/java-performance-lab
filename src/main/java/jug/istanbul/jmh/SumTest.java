package jug.istanbul.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@Fork(value = 3)
@Warmup(iterations = 3, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
public class SumTest {


    public static void main(String[] args) throws Exception {
        //org.openjdk.jmh.Main.main(args);
        Options opt = new OptionsBuilder()
                .include(SumTest.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }

    @Benchmark
    public static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= 10000; i++)
            sum += i ;// autoboxing
        return sum;
    }

    @Benchmark
    public static long sumPrimitive() {
        long sum = 0L;
        for (long i = 0; i <= 10000; i++)
            sum += i ;
        return sum;
    }
}
