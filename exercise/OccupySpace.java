package exercise;

import java.lang.annotation.Native;

public class OccupySpace {

	public static void main(String[] args) {
			//需要找到各个类型的封装类型
			//The number of bits used to represent a {@code double} value
			//public static final int BYTES = SIZE / Byte.SIZE;
			int a = Byte.SIZE;	//public static final int SIZE = 8;
			int b = Short.SIZE; //public static final int SIZE = 16;
			int c = Integer.SIZE;//@Native public static final int SIZE = 32;
			int d = Long.SIZE;  //@Native public static final int SIZE = 64;
			int e = Float.SIZE; //public static final int SIZE = 32;
			int f = Double.SIZE; //public static final int SIZE = 64;
			int g = Character.SIZE; //public static final int SIZE = 16;
			System.out.println("byte型的占用字节空间--"+a/8+"byte");
			System.out.println("short型的占用字节空间--"+b/8+"bytes");
			System.out.println("int型的占用字节空间--"+c/8+"bytes");
			System.out.println("long型的占字节用空间--"+d/8+"bytes");
			System.out.println("float型的占用字节空间--"+e/8+"bytes");
			System.out.println("double型的占用字节空间--"+f/8+"bytes");
			System.out.println("char型的占用字节空间--"+g/8+"bytes");
	}

}
