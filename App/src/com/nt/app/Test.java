package com.nt.app;

public class Test {
public void add() {
	int x=10+5;
	System.out.println(x);
	}
public String wishMsg(String name) {
	return "good afternoon";
}
	public static void main(String[] args) {
		System.out.println("Hello");
		Test t=new Test();
		t.add();
		System.err.println(t);
        System.out.println(t.wishMsg("satya")); 
	}

}
