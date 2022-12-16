package jug.istanbul.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MyBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1)
    @Measurement(iterations = 1, time = 1)
    @Warmup(iterations = 1, time = 1)
    public void init() {
        // Do nothing
    }


    public static void main(String[] args) throws Exception {
        //org.openjdk.jmh.Main.main(args);
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .build();

        new Runner(opt).run();

    }

}