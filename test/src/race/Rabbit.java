package race;

public class Rabbit implements Runnable{
	
	private boolean flag;
	private int totalStep;
	private int step;
	
	

	public Rabbit(int totalStep) {
		super();
		this.totalStep = totalStep;
	}



	public Rabbit() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		while(step < totalStep) {
			int temp = (int) ((Math.random() * 10) % 2);
			if(temp == 0) flag = false;
			else flag = true;
			if(flag) {
				System.out.println("兔子睡著了");
			}else {
				step++;
				System.out.println("兔子跑了" + step + "步");
			}
		}
		
	}

}
