package shop;

public class Clerk {
	private int product = -1;
	
	private synchronized void waitIfFull() throws InterruptedException {
		while(product != -1) {
			wait();
		}
	}
	
	private synchronized void waitIfEmpty() throws InterruptedException {
		while(product == -1){
			wait();
		}
	}
	
	public synchronized void setProduct(int product) throws InterruptedException {
		waitIfFull();
		this.product = product;
		System.out.println("生產者設定產品" + product);
		notify();
	}
	
	public synchronized void getProduct() throws InterruptedException {
		waitIfEmpty();
		int p = this.product;
		this.product = -1;
		System.out.println("消費者取得產品" + p);
		notify();
	}
	
	
}
