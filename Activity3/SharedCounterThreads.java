package Activity3;

class SharedCounter implements Runnable {
    private static int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        }
    }

    public static int getCounter() {
        return counter;
    }
}
