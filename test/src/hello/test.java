package hello;

public class test {
	public static void main(String[] args) {
		Hello helloProxy = (Hello) LoggingProxy.bind(new HelloSpeaker());
		helloProxy.hello("Justin");
	}
}
