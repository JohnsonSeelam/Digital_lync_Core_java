package com.dl.basics1;

public class Eg3 {

	public static void main(String[] args) {
		//MAX_MIN VALUES USING WRAPPER CLASSES.
		System.out.println(Byte.MAX_VALUE+" "+Byte.MIN_VALUE);//127 -128
		System.out.println(Short.MAX_VALUE+" "+Short.MIN_VALUE);//32767 -32768
		System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);//2147483647 -2147483648
		System.out.println(Long.MAX_VALUE+" "+Long.MIN_VALUE);//9223372036854775807 -9223372036854775808
		
		System.out.println(Float.MAX_VALUE+" "+Float.MIN_VALUE);//3.4028235E38 1.4E-45
		System.out.println(Double.MAX_VALUE+" "+Double.MIN_VALUE);//1.7976931348623157E308 4.9E-324
		
		System.out.println(Character.MAX_VALUE+" "+Character.MIN_VALUE);//?
		
		System.out.println(Boolean.TRUE);//true
		
		// FIND SIZE USING WRAPPER CLASSES.
		System.out.println(Byte.SIZE);//8
		System.out.println(Short.SIZE);//16
		System.out.println(Integer.SIZE);//32
		System.out.println(Long.SIZE);//64
		
		System.out.println(Float.SIZE);//32
		System.out.println(Double.SIZE);//64
		
		System.out.println(Character.SIZE);//16
		
		//FIND BYTES USING WRAPPER CLASSES.
		
		System.out.println(Byte.BYTES);//1
		System.out.println(Short.BYTES);//2
		System.out.println(Integer.BYTES);//4
		System.out.println(Long.BYTES);//8
		
		System.out.println(Float.BYTES);//4
		System.out.println(Double.BYTES);//8
		
		System.out.println(Character.BYTES);//2

	}

}
