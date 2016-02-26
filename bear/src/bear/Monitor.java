package bear;

public class Monitor {
	Integer pot;
	Integer max;
	public Monitor(int i){
		pot=0;
		max=i;
	}
	public void produceHoney(int iD) {
		synchronized(pot){
			System.out.println("honey produced");
			pot++;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pot.notifyAll();
		}
	}
	public void eatHoney() {
		synchronized(pot){
			if(pot==0){
				System.out.println("waiting");
				try {
					pot.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Yummy!");
		}
		
	}

}
