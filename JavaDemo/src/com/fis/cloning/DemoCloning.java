package com.fis.cloning;

public class DemoCloning implements Cloneable{
	
	SingletonClass singletonClass;
	int temp;
	
	DemoCloning(){
		temp = 100;
		singletonClass = SingletonClass.getInstance();
	}
	
	public Object clone() throws CloneNotSupportedException {
		DemoCloning obj = (DemoCloning) super.clone();
		//obj.singletonClass = SingletonClass.getInstance();
		return obj;
	}
	
	public static void main(String args[]) throws CloneNotSupportedException {
		DemoCloning demoCloning = new DemoCloning();
		DemoCloning demoCloning1 = (DemoCloning) demoCloning.clone();
		demoCloning1.singletonClass.a = 1000;
		
		System.out.println("demoCloning::: "+demoCloning.temp+"   "+demoCloning.hashCode()+"  "+demoCloning.singletonClass.hashCode()+"  "+demoCloning.singletonClass.a);
		System.out.println("demoCloning1::: "+demoCloning1.temp+"   "+demoCloning1.hashCode()+"  "+demoCloning1.singletonClass.hashCode()+"  "+demoCloning1.singletonClass.a);
	}

}
