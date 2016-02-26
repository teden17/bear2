package birds;

public class Mama extends Thread{

	@Override
	public void run() {
			while(true){
				BirdMain.pot.mamaSleep();
			}
			
		
	}

}
