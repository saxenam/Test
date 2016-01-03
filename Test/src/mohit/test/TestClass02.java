package mohit.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass02 {
	
	public static void main (String args[]) throws IOException{
		int size = 0;

		List<String> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Size
		String line = br.readLine();
		size = Integer.parseInt(line);

		for (int i = 0; i < size; i++) {
			list.add(br.readLine());
		}
		
		
		System.out.println(getScore("abcd"));
		
	}

	
	public static int getScore(String s){
		char[] charArray = s.toCharArray();
		List<Character> list = new ArrayList<Character>();
		
		int score = 0;
		int totalScore = 0;
		
		String left = "";
		String right = "";
		String current = "";
		String total = "";
		
		for(char c : charArray){
			list.add(c);
		}
 		
		for(int i = 0 ; i < charArray.length ; i++){

			if(!(list.contains(charArray[i]))){
				list.add(charArray[i]);
			} else {
				for (int j = 0 ;j<list.size();j++){
				//	if(list.get(j))
				}
			}
			
		}
		

		

		
		
		
		return 0;
	}
}
