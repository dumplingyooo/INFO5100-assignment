package part2;

import java.io.*;

class solution{
	public static void parse(File file) throws Exception{
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch(Exception a){
		}finally {
			if (input != null) {
				input.close();
			}
		}
	}
}