package birds;

public class BirdMain {
	public static Monitor pot = new Monitor();

	public static void main(String[] args) {
		Mama mama = new Mama();
		mama.start();
		int numberofbabies = 5;
		for(int i = 0; i < numberofbabies; i++){
			Baby baby = new Baby(i+1);
			baby.start();
		}

	}

}
