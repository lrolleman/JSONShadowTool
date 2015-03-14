import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ActionLists {
	public static ArrayList<ArrayList<ArrayList<String>>> mlist;
	public static ArrayList<ArrayList<ArrayList<String>>> alist;
	private static String curtype = null;
	
	public static String srcdir;
	public static String moddir;
	public static ArrayList<String> excludelist;
	
	public static void populateLists() {
		mlist = new ArrayList<ArrayList<ArrayList<String>>>();
		alist = new ArrayList<ArrayList<ArrayList<String>>>();
		excludelist = new ArrayList<String>();
		File infile = new File("ActionLists.txt");
		String line;
		try {
			FileReader infilereader = new FileReader(infile);
			BufferedReader reader = new BufferedReader(infilereader);
			while ((line = reader.readLine()) != null) {
				line = line.trim();
				System.out.println(line);
				if (line.startsWith("//") || line.isEmpty() || line.startsWith("}")) {
					continue;
				} else if (line.startsWith("srcdir")) {
					int sindex = line.indexOf("=");
					srcdir = line.substring(sindex+1).trim();
				} else if (line.startsWith("moddir")) {
					int mindex = line.indexOf("=");
					moddir = line.substring(mindex+1).trim();
				} else if (line.startsWith("exclude")) {
					while (!(line = reader.readLine()).startsWith("}")) {
						excludelist.add(line.trim());
					}
				}
				else {
					if (line.startsWith("{")) {
						ArrayList<String> keyvalue = new ArrayList<String>();
						String key;
						String value;
						int iindex = line.indexOf("\"", 1);
						int jindex = line.indexOf("\"", iindex+1);
						key = line.substring(iindex+1, jindex);
						iindex = line.indexOf("\"", jindex+1);
						jindex = line.indexOf("\"", iindex+1);
						value = line.substring(iindex+1, jindex);
						iindex = line.indexOf("\"", jindex+1);
						jindex = line.indexOf("\"", iindex+1);
						curtype = line.substring(iindex+1, jindex);
						
						keyvalue.add(key);
						keyvalue.add(value);
						ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
						array.add(keyvalue);
						switch (curtype) {
						case "multiply":
							mlist.add(array);
							//mlist.get(mlist.size()-1).add(keyvalue);
							break;
						case "absolute":
							alist.add(array);
							//alist.get(alist.size()-1).add(keyvalue);
							break;
						}
					} else {
						ArrayList<String> filevalue = new ArrayList<String>();
						String name;
						int iindex = line.indexOf("\"");
						int jindex = line.indexOf("\"", iindex+1);
						name = line.substring(iindex+1, jindex);
						filevalue.add(name);
						iindex = line.indexOf("\"", jindex+1);
						if (iindex != -1) {
							jindex = line.indexOf("\"", iindex+1);
							String ovalue = line.substring(iindex+1, jindex);
							filevalue.add(ovalue);
						}
						switch (curtype) {
						case "multiply":
							mlist.get(mlist.size()-1).add(filevalue);
							break;
						case "absolute":
							alist.get(alist.size()-1).add(filevalue);
							break;
						}
					}
					
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
