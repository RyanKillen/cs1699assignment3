package assignment3normal;

import java.io.*;
import java.util.*;

public class WordCountNormal {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		long initTime = System.currentTimeMillis();
		File file1 = new File("C:\\Users\\gursh\\eclipse-workspace\\assignment3normal\\src\\assignment3normal\\file1");
		File file2 = new File("C:\\Users\\gursh\\eclipse-workspace\\assignment3normal\\src\\assignment3normal\\file2");
		File file3 = new File("C:\\Users\\gursh\\eclipse-workspace\\assignment3normal\\src\\assignment3normal\\file3");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

		try(Scanner sc = new Scanner(new FileInputStream(file1))){
		    while(sc.hasNext()){
		    	String s = sc.next();
		        Integer currCounter = wordCount.get(s);
		        if(currCounter == null) {
		        	currCounter = 1;
		        } else {
		        	currCounter++;
		        }
		        wordCount.put(s, currCounter);
		   
		    }
		}
		
		try(Scanner sc = new Scanner(new FileInputStream(file2))){
		    while(sc.hasNext()){
		    	String s = sc.next();
		        Integer currCounter = wordCount.get(s);
		        if(currCounter == null) {
		        	currCounter = 1;
		        } else {
		        	currCounter++;
		        }
		        wordCount.put(s, currCounter);
		   
		    }
		}
		
		try(Scanner sc = new Scanner(new FileInputStream(file3))){
		    while(sc.hasNext()){
		    	String s = sc.next();
		        Integer currCounter = wordCount.get(s);
		        if(currCounter == null) {
		        	currCounter = 1;
		        } else {
		        	currCounter++;
		        }
		        wordCount.put(s, currCounter);
		   
		    }
		}
		
		PrintWriter writer = new PrintWriter("C:\\Users\\gursh\\eclipse-workspace\\assignment3normal\\src\\assignment3normal\\output.txt", "UTF-8");
		wordCount.forEach((k,v)-> writer.println(k + ": " + v));
		writer.close();
		
		
		long executionTime = System.currentTimeMillis() - initTime;
		System.out.println("execution time (ms):" + executionTime);
		
	}
}
