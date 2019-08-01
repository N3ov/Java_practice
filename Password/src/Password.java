import java.io.*;

public class Password {
	
	public static void main(String args[]){
		
		Console console = System.console();
		if (console == null) {
			System.err.println("Sales:unable to obtain console.");
			return;
		}
		
		String password = new String(console.readPassword("Enter password:"));
		System.out.println(password);
	}
}
