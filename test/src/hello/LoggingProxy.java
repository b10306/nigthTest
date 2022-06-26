package hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingProxy {
	
	public static Object bind(Object target) {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new LoggingHandler(target));
	}
	
	private static class LoggingHandler implements InvocationHandler {

		private Object target;
		
		LoggingHandler(Object target){
			this.target = target;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Object result = null;
			
			log(method.getName() + "() 呼叫開始");
			result = method.invoke(target, args);
			log(method.getName() + "()呼叫結束");
			
			return result;
		}
		
		private void log(String message) {
			Logger.getLogger(LoggingHandler.class.getName()).log(Level.INFO, message);
		}
		
	}
}
