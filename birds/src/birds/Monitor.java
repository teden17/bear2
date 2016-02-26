package birds;

public class Monitor {
	Integer max = 10;
	Integer worms = max;
	Integer babysWaiting = 0;
	Integer empty = 1;

	public void babySleep(int ID) {
		long sleepTime = (long) (Math.random()*3000);
		System.out.println("baby "+ID+ "going to sleep");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("baby "+ID+ "woke up and now wants to eat");
		babyEat(ID);

	}

	public void babyEat(int ID){
		synchronized(worms){
			if(worms <= 0){
				System.out.println("baby "+ID+" tries to wake up mummy");
				worms.notify();
				try {
					System.out.println(ID+ " then waits");
					worms.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			worms--;
			System.out.println("baby "+ID+" said jummy.. "+ worms +" worms left");	
		}
		babySleep(ID);
	}

	public void mamaSleep() {
		System.out.println("mama sleeps");
		synchronized(worms){
			try {
				if(worms>0){
					System.out.println("mama waits");
					worms.wait();
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			collectDish();
		}

	}

	private void collectDish() {
		System.out.println("mama woked up");
		worms = max;
		System.out.println("dish collected");
		worms.notifyAll();
		mamaSleep();
	}

}
