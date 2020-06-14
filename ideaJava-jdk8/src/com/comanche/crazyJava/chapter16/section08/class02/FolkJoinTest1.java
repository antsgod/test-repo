package com.comanche.crazyJava.chapter16.section08.class02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class FolkJoinTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[200];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            sum += i;
        }
        System.out.println(sum);
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        ForkJoinTask<Integer> submit = forkJoinPool.submit(new SumTask(arr, 0, arr.length));
        System.out.println(submit.get());
        forkJoinPool.shutdown();
    }
}

class SumTask extends RecursiveTask<Integer> {
    private static final int threshold = 20;
    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if(end - start < threshold){
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        }else{
            int middle = (start + end)/2;
            SumTask left = new SumTask(arr, start, middle);
            SumTask right = new SumTask(arr, middle, end);
            left.fork();
            right.fork();
            return left.join()+right.join();
        }
    }
}

