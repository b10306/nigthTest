package race;

public class Race {
	public static void main(String[] args) throws InterruptedException {
		Turtle turtle = new Turtle(10);
		Rabbit rabbit = new Rabbit(10);
		Thread tThread = new Thread(turtle);
		Thread rThread = new Thread(rabbit);
		rThread.start();
		rThread.join();
		tThread.start();
	}
}
