package com.createSpringContext.ioc;

public class HelloWorld {
	private String stringMsg;
	
	public String getStringMsg() {
		return stringMsg;
	}

	public void setStringMsg(String stringMsg) {
		System.out.println("seeting setter method");
		this.stringMsg = stringMsg;
	}

	public HelloWorld(String stringMsg) {
		super();
		System.out.println("Prametrrised constructor");
		this.stringMsg = stringMsg;
	}

	@Override
	public String toString() {
		return "HelloWorld [strinMsg=" + stringMsg + "]";
	}

	public HelloWorld() {
		super();
		System.out.println("default cpnstructor invoked");
		
	}
	

}
