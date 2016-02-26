package bear;


public class Bear extends Thread{

	@Override
	public void run() {
			while(true){
				BearMain.pot.eatHoney();
			}
			
		
	}

}
