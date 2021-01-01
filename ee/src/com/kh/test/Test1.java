package com.kh.test;

public class Test1 {
	
	public static void main(String[] args) {
		int i=100;
		System.out.println(i);
		
		long l = 999_900_000_000L;
		System.out.println(l);
		
		float f = 486.520F;
		System.out.println(f);
		
		double d = 567.890123;
		System.out.println(d);
		
		char c ='A';
		System.out.println(c);
		
		String hi = "Hello world";
		System.out.println(hi);
		
		boolean b = (13 >= 11);
		System.out.println(b);
		
		
	}

	
	public void test2(){
        System.out.println("A = "+ ('A'+0));
        //A = A0
        System.out.println("0 =" + ('0' + 0) );
        //0 = 00
        System.out.println("(char)65 = " + (char)65);
        //AA
        byte bt1 = 125; //int자동변환 125그대로 출력
        char ch1 = 'C'; // 67
        int it1 = bt1 - ch1; // 125-67 = 58
        System.out.println("it1 = "+it1);
        //it1 = 58
        
        boolean bool = false;
        
        bool = (2.0 == 5/2);
        System.out.println("bool = " + bool);
        //bool = false
        bool = ('C' == 67);
        System.out.println("bool = " + bool);
        //bool = true
        bool = ('A' == 'B'-1);
        System.out.println("bool = " + bool);
        //bool = true
        bool = ('a' != 97 );//부정연산자
        System.out.println("bool = " + bool);
        //bool = false
	}
	
	
	
}


