package forkjosinStudy;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import org.junit.Test;

import com.dimit.Calculator;

public class forkjoinTest {

    @Test
    public void run() throws Exception{
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future<Integer> result = forkJoinPool.submit(new Calculator(0, 100));
        System.out.println(result.get());
        assertEquals(new Integer(5050), result.get());
    }

}
