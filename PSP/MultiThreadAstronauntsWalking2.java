package PSP;

public class MultiThreadAstronauntsWalking2 {
	public static void main(String[] args) {
		// Create threads
		Astronaunt astronaunt1 = new Astronaunt ("Manolo",2) ;
		Astronaunt astronaunt2 = new Astronaunt ("Pepe",3) ;
		Astronaunt astronaunt3 = new Astronaunt ("Manuel",1) ;
		
		// Start the threads
		astronaunt1.start();
		astronaunt2.start();
		astronaunt3.start();
		
		// Main threads continues
		System.out.println("All astronaunts are walking...");
		
	}
}
