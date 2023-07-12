package com.dl.casting;

public class Eg2 {

	public static void main(String[] args) {
		//Explicit
		double d=10.0;
		float f=(float)d;
		System.out.println(f);
		long l=(long)f;
		System.out.println(l);
		int i=(int)l;
		System.out.println(i);
		short s=(short)i;
		System.out.println(s);
		byte b=(byte)s;
		System.out.println(b);
		char ch='A';
		int i3=(int)ch;
		System.out.println(i3);
		
		
		int i1=10;
		int i2=20;
		short s1=(short)(i1+i2);
		System.out.println(s1);
		
		byte b1=(byte)(short)(int)(long)s1;
		System.out.println(b1);
		
		
		
	}

}
