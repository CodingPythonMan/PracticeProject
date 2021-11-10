package com.spring.product;

public class SamsungUTV implements TV {

	public SamsungUTV() {
		System.out.println("SamsungUTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungUTV---전원을 켠다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungUTV---전원을 끈다");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungUTV---소리를 올린다");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungUTV---소리를 내린다");
		
	}

}
