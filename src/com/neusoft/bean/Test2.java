package com.neusoft.bean;

import java.util.jar.Attributes.Name;

public class Test2 {

	public static void main(String[] args) {
		//��̬��ǰ��������Ҫ�м̳л���ʵ�ֹ�ϵ
		//�ڴ���ʵ����,����ø��������ָ���ұ�����Ķ���
		//ִ��ͬ���������õ���ͬ���
		
		
//		Animal animal = new Dog();
//		animal.eat();
		Animal animal2 = new Animal();
		animal2.setAge(2);
		animal2.getAge();
		
		animal2.setName("dog");
		animal2.getName();
		
		
		
		System.out.println(animal2.getName()+"��������"+animal2.getAge());
		
//		animal = new Cat();
//		animal.eat();
		

	}

}
