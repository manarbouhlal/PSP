package PSP;

class Astronaunt2 implements Runnable{
	private String astronauntName;
	private int walkTime;
	
	
	public Astronaunt2(String astronauntName, int walkTime) {
		this.astronauntName = astronauntName;
		this.walkTime = walkTime;
	}
	
	@Override
	public void run() {
		System.out.println(astronauntName + " started walking");
		try {
			// Simulate walking time with breaks
			Thread.sleep(walkTime * 1000L);
			}catch (InterruptedException e) {
				System.out.println(astronauntName+ " was interrupted while walking");
			}
		System.out.println(astronauntName + " finished walking");
	}
}