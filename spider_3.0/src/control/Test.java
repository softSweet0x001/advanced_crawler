package control;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import crawler.Crawler_DEFAULT;
import crawler.Crawler_HOJ;
import interfaces.Crawler;

class cat
{
	static {System.out.println("loading cat");}
}

class dog
{
	static {System.out.println("loading dog");}
}

class bird
{
	static {System.out.println("loading bird");}
}

public class Test {

	public static void main(String[] args) throws InterruptedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		ExecutorService pool = Executors.newCachedThreadPool();	
		
		
//		String className = "control.Main";
//		Class c = null;
//		try {
//			c = Class.forName(className);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Field[] fields= c.getDeclaredFields();
//		for(int i=0;i<fields.length;++i)
//		{
//			System.out.println(i+"　:　"+fields[i]);
//		}
//		fields[2].setAccessible(true);
//		fields[2].get();
//		Constructor cs[]= c.getConstructors();
//		for(int i=0;i<cs.length;++i)
//		{
//			System.out.println(cs[i]);
//		}
//		cs[0].setAccessible(true);
//		Main m1 = (Main) cs[0].newInstance();
//		Method methods[] = c.getDeclaredMethods();
//		for(int i=0;i<methods.length;++i)
//		{
//			System.out.println(methods[i]);
//		}
//		Main m2=new Main();
//		methods[8].setAccessible(true);
//		methods[8].invoke(m2);
//		pool.execute(new Catcher_30());
//		pool.execute(new Crawler_30());
//		
//		for(int i=0;i<233;++i)
//		{
//			System.out.println(Main.communication.urlSize());
//			System.out.println(Main.communication.sourceSize());
//			System.out.println(Main.communication.resultSize());
//			System.out.println("pool:　"+pool);
//			Thread.sleep(1000);
//			
//		}

//		String str = null;
//		Scanner cin = new Scanner(System.in);
//		str = cin.next();
//		Crawler c = null;
//		try {
//			c = (Crawler) Class.forName(str).newInstance();
//		} catch (ClassNotFoundException e) {
//			c = Crawler_DEFAULT.class.newInstance();
//		}
		
		Class c = Class.forName("control.Main");
		 c = dog.class;
		 c = new cat().getClass();
		
		
	}

}
