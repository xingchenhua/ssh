package com.neusoft.bean;

public class Animal {
	private String Name;
	private int Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	//���أ���������ͬ��������һ��
	public void eat(){
		System.out.println("animal eat");
	} 
	public void eat(String food){
		System.out.println("animal eat"+food);
	} 
   


}
