package com.designpattern;

//Class need to final so no other class can extend
final class SingletonModel {
	private static SingletonModel instance;
	// Private constructor to
	// prevent external instantiation
	private SingletonModel() {
		System.out.println("Singleton is Instantiated.");
	}
	
	// Only one thread can execute this at a time
	public static synchronized SingletonModel getInstance() {
		if(instance == null) {
			return new SingletonModel();
		}
		return instance;
	}
	
    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
} 

//Static initializer based Java implementation of
//While class loading only we are loading a object(Eager Loading)
class Singleton {
 private static Singleton obj = new Singleton();
 private Singleton() {}

 public static Singleton getInstance() { return obj; }
}

public class SingletonExample {
    public static void main(String[] args)
    {
    	SingletonModel.getInstance().doSomething();
    }
}
