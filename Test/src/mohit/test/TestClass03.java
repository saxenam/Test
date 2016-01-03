package mohit.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestClass03 {

	public static void main(String args[]) throws IOException {
		int size = 0;

		List<String> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Size
		String line = br.readLine();
		size = Integer.parseInt(line);

		for (int i = 0; i < size; i++) {
			list.add(br.readLine());
		}
		
		System.out.print(getMaxAnagrams(list));

	}

	public static int getMaxAnagrams(List<String> list) {

		List<String> temp = new ArrayList<String>();
		char[] t = null;
		String st = "";
		for (String s : list) {
			t = s.toCharArray();
			Arrays.sort(t);

			for (char c : t) {
				st = st + c;
			}
			
			temp.add(st);
			st = "";

		}
		
		Collections.sort(temp);
		
		int maxValue = 1;
		
		Map<String,Integer> m = new LinkedHashMap<String,Integer>();
		
		for(String s: temp){
			
			if(!m.containsKey(s)){
				m.put(s, 1);				
			} else {
				int value = m.get(s) + 1;
				if(maxValue <= value) {
					maxValue=value;
				}
				
				m.put(s, value);
			}
			

		}


		return maxValue;
	}

}
