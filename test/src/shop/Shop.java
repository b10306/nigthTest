package shop;

public class Shop {

	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Thread pthread = new Thread(new Producer(clerk));
		Thread cthread = new Thread(new Consumer(clerk));
		pthread.start();
		cthread.start();
	}

}
