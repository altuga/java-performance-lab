package jug.istanbul.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Optional;
import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@Fork(value = 3)
@Warmup(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 5, time = 100, timeUnit = TimeUnit.MILLISECONDS)
public class ExceptionTest {


    public static void main(String[] args) throws Exception {
        //org.openjdk.jmh.Main.main(args);
        Options opt = new OptionsBuilder()
                .include(ExceptionTest.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }

    @Benchmark
    public void runWithException(Blackhole bh) {
        for (int i = 0; i < 100000; i++) {
            try {
                throw new IndexOutOfBoundsException("Hello");
            } catch (Exception ex) {
                bh.consume(i);
            }

        }
    }

    @Benchmark
    public void justRun(Blackhole bh) {
        for (int i = 0; i < 100000; i++) {
            Optional<String> s = Optional.of(new String("String to intern " + i));
            String t = s.get();
            bh.consume(t);
        }
    }
}
