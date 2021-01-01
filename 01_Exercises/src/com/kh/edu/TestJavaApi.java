package com.kh.edu;

import java.util.Date;
import java.text.*;

public class TestJavaApi {

	public static void main(String[] args){ 
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/M/d");
		
		Date now = new Date();
		String today = formatter.format(now);
		
		System.out.println(today);
	}
}

