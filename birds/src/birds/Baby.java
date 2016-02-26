package birds;

public class Baby extends Thread{
	int ID;
	
	public Baby(int ID){
		this.ID = ID;
	}

	@Override
	public void run() {
		BirdMain.pot.babySleep(ID);
		
	}

	
}
