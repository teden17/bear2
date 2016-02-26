package bear;

public class BearMain {
	public static Monitor pot = new Monitor(100);

	public static void main(String[] args) {
		Bear bear = new Bear();
		bear.start();
		HoneyBee bee = new HoneyBee(17);
		bee.start();

	}

}
