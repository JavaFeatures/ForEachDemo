package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ForEachDemo3 {

	public static void main(String[] args) throws IOException {
		List<String> namesList = new ArrayList<String>();
		while (true) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String name = reader.readLine();
			namesList.add(name);
			System.out.println("Names List:");
			namesList.forEach(str -> System.out.println(str));
		}
	}

}
