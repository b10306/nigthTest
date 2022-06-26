package shop;

public class Producer implements Runnable{

	private Clerk clerk;
	
	
	public Producer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}


	public Producer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void run() {
		System.out.println("生產者開始生產整數....................");
		for(int i = 1; i <= 10; i++) {
			try {
				clerk.setProduct(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
