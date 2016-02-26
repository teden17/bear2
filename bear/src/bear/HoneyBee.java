package bear;

public class HoneyBee extends Thread{
	int ID;
	public HoneyBee(int ID){
		this.ID=ID;
	}

	@Override
	public void run() {
			while(true){
				BearMain.pot.produceHoney(ID);
			}
			
		
	}

}