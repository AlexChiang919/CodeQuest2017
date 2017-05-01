import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Prob14 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan;
		try {
			scan = new BufferedReader(new FileReader(Prob14.class.getName() + ".in.txt"));
		} catch (FileNotFoundException ex) {
			printF(true, "File not found: %s", ex.getMessage());
			return;
		}
		int N = Integer.parseInt(scan.readLine());
		while (N-- > 0) {
			TreeMap<String, TreeSet<String>> catalog = new TreeMap<String, TreeSet<String>>();
			StringTokenizer st = new StringTokenizer(scan.readLine(), ",");
			String a = st.nextToken();
			String b = st.nextToken();
			if (b.equals("None") && catalog.containsKey(a)) {
				
			}
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
