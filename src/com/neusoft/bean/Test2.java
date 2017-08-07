package com.neusoft.bean;

import java.util.jar.Attributes.Name;

public class Test2 {

	public static void main(String[] args) {
		//多态：前提条件就要有继承或者实现关系
		//在代码实现上,左边用父类的引用指向右边子类的对象。
		//执行同样方法，得到不同结果
		
		
//		Animal animal = new Dog();
//		animal.eat();
		Animal animal2 = new Animal();
		animal2.setAge(2);
		animal2.getAge();
		
		animal2.setName("dog");
		animal2.getName();
		
		
		
		System.out.println(animal2.getName()+"的年龄是"+animal2.getAge());
		
//		animal = new Cat();
//		animal.eat();
		

	}

}
