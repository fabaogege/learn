package designPatterns;
/*
 * 单例设计模式：确保某个类只有1个实例，并提供一个全局访问点
 * 特点：1.单例类只能有一个实例。
	   2.单例类必须自己创建自己的唯一实例。
	   3.单例类必须给所有其他对象提供这一实例。
 * */
public class Singleton {

	public static void main(String[] args) {

	}
}
/*
 * 饿汉式		描述：只要调用该类就会实例化对象，线程安全，但是耗费资源（有时候调用这个类只需要调用这个类的一个方法，不需要实例化整个对象）
 * */ 
//饿汉式1	属性实例化对象
class Singleton1{
	private static Singleton1 instance = new Singleton1();
	private Singleton1() {}	//把构造器设置成私有的，只有单例类的方法内调用构造器
	public static Singleton1 getInstance() {
		return instance;
	}
	
}
//饿汉式2  静态代码块实例化对象
class Singleton2{
	private static Singleton2 instance;
	static {
		instance = new Singleton2();
	}
	private Singleton2() {}	//把构造器设置成私有的，只有单例类的方法内调用构造器
	public static Singleton2 getInstance() {
		return instance;
	}
}
/*
 * 懒汉式  描述：需要的时候才去调用实例对象
 * */
//懒汉式1   非线程安全  如果有两个线程同时调用getInstance()方法，则会创建两个实例化对象。所以是非线程安全的
class Singleton3{
	private static Singleton3 instance;
	private Singleton3() {}
	public static Singleton3 getInstance() {
		if(instance ==null) {
			instance = new Singleton3();
		}
		return instance;
	}
}
//懒汉式2  给方法加锁  线程安全   如果有多个线程调用getInstance()方法，当一个线程获取该方法，而其它线程必须等待，消耗资源。
class Singleton4{
	private static Singleton4 instance;
	private Singleton4() {}
	public static synchronized Singleton4 getInstance() {
		if(instance == null) {
			instance = new Singleton4();
		}
		return instance; 
	}
}	
//懒汉式3 双重检查锁(给方法加锁以及加同步代码块)
/*
 * 为什么需要双重检查锁呢？因为第一次检查是确保之前是一个空对象，而非空对象就不需要同步了，
 * 空对象的线程然后进入同步代码块，如果不加第二次空对象检查，两个线程同时获取同步代码块，
 * 一个线程进入同步代码块，另一个线程就会等待，而这两个线程就会创建两个实例化对象，
 * 所以需要在线程进入同步代码块后再次进行空对象检查，才能确保只创建一个实例化对象。
 * */
class Singleton5{
	private static Singleton5 instance;
	private Singleton5() {};
	 public static synchronized Singleton5 getInstance() {
		 if(instance==null) {
			 synchronized (Singleton5.class) {
				 if(instance ==null) {
					 instance = new Singleton5();
				 }
			 }
		 }
		 return instance;

	 }
}
//懒汉式4  利用volatile声明避免JVM指令重排序
class Singleton6{
	private volatile static Singleton6 instance;
	private Singleton6() {};
	 public static synchronized Singleton6 getInstance() {
		 if(instance==null) {
		 synchronized (Singleton6.class) {
			 if(instance ==null) {
				 instance = new Singleton6();
			 }
		 }
		 }
		 return instance;
	 }
}



