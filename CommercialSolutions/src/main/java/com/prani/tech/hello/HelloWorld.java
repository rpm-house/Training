package com.prani.tech.hello;

import com.prani.tech.access.AccessSpeicifiers;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hi Rohith!");

		AccessSpeicifiers access = new AccessSpeicifiers();
		System.out.println(access.add(12, 35));
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(access.display("Jyothi!"));
	}

}
