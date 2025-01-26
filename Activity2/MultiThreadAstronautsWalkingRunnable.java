package Activity2;

class Astronaut2 implements Runnable {
    private String astronautName;
    private int walkTime;

    public Astronaut2(String astronautName, int walkTime) {
        this.astronautName = astronautName;
        this.walkTime = walkTime;
    }

    @Override
    public void run() {
        System.out.println(astronautName + " started walking");
        try {
            Thread.sleep(walkTime * 1000L);
        } catch (InterruptedException e) {
            System.out.println(astronautName + " was interrupted while walking");
        }
        System.out.println(astronautName + " finished walking");
    }
}

public class MultiThreadAstronautsWalkingRunnable {
    public static void main(String[] args) {
        // Create threads
        Thread astronaut1 = new Thread(new Astronaut2("Manolo", 2));
        Thread astronaut2 = new Thread(new Astronaut2("Pepe", 3));
        Thread astronaut3 = new Thread(new Astronaut2("Manuel", 1));

        // Start the threads
        astronaut1.start();
        astronaut2.start();
        astronaut3.start();

        // Main thread continues
        System.out.println("All astronauts are walking...");
    }
}
