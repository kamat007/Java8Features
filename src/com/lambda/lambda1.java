package com.lambda;

import java.util.ArrayList;
import java.util.List;

interface Drawable{
	public void draw();
}
interface Sayable{
	public String say();
}
interface Sayable1{
	public String say(String name);
}
interface Addable{
	int add(int a, int b);
}
interface Sayable3{
	String say(String message);
}

public class lambda1 {
	public static void main(String[] args) {
		int width1=10;
		int width2=20;
		
		// normal
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drwaing: " + width1);
			}
		};
		d.draw();
		
		// by using lambda
		Drawable d1 = ()->{
			System.out.println("Drawing " + width2);
		};
		d1.draw();
		
		// no parameter
		Sayable s = () ->{
			return "I have nothing to say";
		};
		System.out.println(s.say());
		
		// single parameter
		Sayable1 s1 = name ->{
			return "Hello " + name;
		};
		System.out.println(s1.say("Rishi"));
		Sayable1 s2 = (name) ->{
			return "Hello " + name;
		};
		System.out.println(s2.say("Ram"));
		
		// Multiple Parameters
		Addable add1 = (a, b) ->(a+b);
		System.out.println(add1.add(width1, width2));
		
		Addable add2 = (int a, int b) -> (a+b);
		System.out.println(add2.add(30, 40));
		
		Addable add3 = (int a, int b) ->{
			return (a+b);
		};
		System.out.println(add3.add(100, 200));
		
		// ForEach Loop
		List<String> list = new ArrayList<String>();
		list.add("Rishi");
		list.add("Ram");
		list.add("Shyam");
		list.add("jai");
		list.forEach((n)->System.out.println(n));
		
		// Multiple Statements
		Sayable3 person = (message) -> {
			String str = "I would like to stay, ";
			String str1 = str + message;
			return str1;
		};
		System.out.println(person.say("time is precious."));
		
	}
}
