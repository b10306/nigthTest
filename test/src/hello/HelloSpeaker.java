package hello;

public class HelloSpeaker implements Hello{

	@Override
	public void hello(String name) {
		System.out.println("哈囉, " + name);
	}
	
}
