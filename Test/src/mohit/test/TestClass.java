package mohit.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String args[]) throws IOException {
		int qSize = 0;
		List<Integer> queue = new ArrayList<>();
System.out.println("change by mohit new change");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a=0;
		// Size
		String line = br.readLine();
		qSize = Integer.parseInt(line);

		// Element
		String[] qElements = br.readLine().split(" ");
		for (String s : qElements) {
			queue.add(Integer.parseInt(s));
		}

		// Operation
		String o = br.readLine();

		if (o.equalsIgnoreCase("0")) {

			for (int i = 1; i < qSize; i++) {
				System.out.print(queue.get(i) + " ");
			}

		} else {
			// ReadNew Element
			int newElement = Integer.parseInt(br.readLine());
			queue.add(newElement);

			for (int i = 0; i < queue.size(); i++) {
				System.out.print(queue.get(i) + " ");
			}

		}

	}

}
