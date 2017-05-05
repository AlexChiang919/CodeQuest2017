import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Prob16 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan;
		try {
			scan = new BufferedReader(new FileReader(Prob16.class.getName() + ".in.txt"));
		} catch (FileNotFoundException ex) {
			printF(true, "File not found: %s", ex.getMessage());
			return;
		}
		int N = Integer.parseInt(scan.readLine());
		while (N-- > 0) {
			String[] split = scan.readLine().split("[\\:\\s]");
			
		}
		scan.close();

	}
	
	public static void print(Object... obj) {
		for (Object o : obj)
			System.out.print(o);
	}
	
	public static void printF(boolean newLine, String format, Object... o) {
		System.out.printf(format + (newLine ? "\n" : ""), o);
	}
	
	public static void printLine(Object... obj) {
		if (obj.length <= 0) {
			printLine();
			return;
		}
		for (Object o : obj)
			System.out.println(o);
	}

	public static void printArray(char[][] array) {
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array.length; c++)
				print(array[r][c]);
			printLine();
		}
	}
}
