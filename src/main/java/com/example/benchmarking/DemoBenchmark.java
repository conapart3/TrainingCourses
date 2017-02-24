package com.example.benchmarking;

import com.google.caliper.AfterExperiment;
import com.google.caliper.BeforeExperiment;
import com.google.caliper.Benchmark;
import com.google.caliper.Param;
import com.google.caliper.api.VmOptions;
import com.google.caliper.runner.CaliperMain;

@VmOptions("-server")
public class DemoBenchmark
{
//    @Param({"abc", "def", "xyz"})
//    String string;


    /**
     * A simple benchmark to test the efficiency of System.nanoTime().
     */
    public static class Benchmark1
    {

        @Param({"10", "100", "1000", "10000"})
        private int length;

        public static void main(String[] args)
        {
            CaliperMain.main(Benchmark1.class, args);
        }

        @Benchmark
        void timeNanoTime(int reps)
        {
            for (int i = 0; i < reps; i++) {
                System.nanoTime();
            }
        }
    }

    /**
     * Our benchmark to test the performance of isEmpty vs equals.
     */
    public static class Benchmark2
    {

        private String str;

        @BeforeExperiment
        void setUp()
        {
            // @Param values are guaranteed to have been injected by now
            str = "";
        }

        @Benchmark
        void timeIsEmpty(int reps)
        {
            for (int i = 0; i < reps; i++) {
                str.isEmpty();
            }
        }

        @Benchmark
        void timeEquals(int reps)
        {
            for (int i = 0; i < reps; i++) {
                str.equals("");
            }
        }

        @AfterExperiment
        void tearDown() throws Exception
        {
        }
    }

    /**
     * Sample benchmark using parameters.
     */
    public static class Benchmark5
    {
        @Param
        int size; // set automatically by framework

        private int[] array; // set by us, in setUp()

        @BeforeExperiment
        void setUp()
        {
            // @Param values are guaranteed to have been injected by now
            array = new int[size];
        }

        @Benchmark
        int timeArrayIteration(int reps)
        {
            int dummy = 0;
            for (int i = 0; i < reps; i++) {
                for (int doNotIgnoreMe : array) {
                    dummy += doNotIgnoreMe;
                }
            }
            return dummy;
        }
    }
}
