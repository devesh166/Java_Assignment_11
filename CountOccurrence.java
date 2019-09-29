package com.assignment.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class CountOccurrence {
	HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

	public void charOccurrence() {
		try {
			FileReader readFile = new FileReader(
					"/home/zadmin/eclipse-workspace/java_assignments/src/com/assignment/file/TextFile.txt");
			int index;
//			System.out.println("inside method");
			while ((index = readFile.read()) != -1 ) {
//				System.out.println((char)index);
				if (!Character.isWhitespace((char) index)) {
					if (charMap.containsKey((char) index))
						charMap.put((char) index, charMap.get((char) index) + 1);
					else
						charMap.put((char) index, 1);
				}
			}
//			System.out.println(charMap.toString());
			File file = new File("/home/zadmin/eclipse-workspace/java_assignments/src/com/assignment/file/Outputfile.txt");
			FileWriter fwrite = new FileWriter(file);
			fwrite.write(charMap.toString());
			fwrite.close();
			System.out.println("Output file generated!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
