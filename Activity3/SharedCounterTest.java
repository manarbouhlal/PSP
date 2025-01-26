package Activity3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SharedCounterTest {

    @Test
    void testCounterWithSynchronization() throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new Thread(sharedCounter, "Thread-1");
        Thread thread2 = new Thread(sharedCounter, "Thread-2");
        Thread thread3 = new Thread(sharedCounter, "Thread-3");
        Thread thread4 = new Thread(sharedCounter, "Thread-4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        assertEquals(400, SharedCounter.getCounter(), "Counter should be 400 after all increments");
    }
}
