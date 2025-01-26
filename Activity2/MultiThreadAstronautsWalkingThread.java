package Activity2; 

class Astronaut extends Thread {
    private String astronautName;
    private int walkTime;

    public Astronaut(String astronautName, int walkTime) {
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

public class MultiThreadAstronautsWalkingThread {
    public static void main(String[] args) {
        Astronaut astronaut1 = new Astronaut("Manolo", 2);
        Astronaut astronaut2 = new Astronaut("Pepe", 3);
        Astronaut astronaut3 = new Astronaut("Manuel", 1);

        astronaut1.start();
        astronaut2.start();
        astronaut3.start();

        System.out.println("All astronauts are walking...");
    }
}
