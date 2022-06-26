package race;

public class Turtle implements Runnable{
	
	private int totalStep;
	private int step;
	
	

	public Turtle(int totalStep) {
		this.totalStep = totalStep;
	}



	public Turtle() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		while(step < totalStep) {
			step++;
			System.out.println("烏龜跑了 " + step + "步");
		}
	}

}
