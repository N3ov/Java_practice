import java.io.*;

public class WhatIs {
	
	public static void main(String argv[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your age?");
		String age = in.readLine();
		System.out.println(Integer.parseInt(age));
	
	}
}
