package shop;

public class Consumer implements Runnable{
	
	private Clerk clerk;
	
	
	public Consumer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}


	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void run() {
		System.out.println("消費者開始取出整數.......................");
		for(int i = 1; i <= 10; i++) {
			try {
				clerk.getProduct();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
