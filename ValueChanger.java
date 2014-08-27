import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ValueChanger {
	private String dest;
	private String filecontents;
	
	public ValueChanger(String ssrc, String dest) {
		this.dest = dest;
		this.filecontents = "";
		String line;
		String src;
		FileReader rfile;
		File dcheck = new File(dest);
		if (dcheck.exists())
			src = dest;
		else
			src = ssrc;
		
		try {
			rfile = new FileReader(src);
		
			BufferedReader reader = new BufferedReader(rfile);
			while ((line = reader.readLine()) != null) {
				filecontents = filecontents.concat(line);
			}
			reader.close();
			
			Integer iindex = 0;
			Integer jindex = dest.indexOf("\\");
			String curfolder = "";
			while (jindex != -1) {
				curfolder = curfolder + "\\" + dest.substring(iindex, jindex);
				File folder = new File(curfolder);
				if (!folder.exists()) {
					folder.mkdir();
				}
				iindex = jindex + 1;
				jindex = dest.indexOf("\\", iindex);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void change(String id, Integer value) {
		int iindex = filecontents.indexOf("\"" + id + "\"");
		int cindex = filecontents.indexOf(":", iindex);
		int coindex = filecontents.indexOf(",", cindex);
		String fsplit = filecontents.substring(0, cindex+1);
		String ssplit = filecontents.substring(coindex);
		//System.out.println(fsplit);
		filecontents = fsplit + value + ssplit;
		FileWriter fwriter;
		try {
			fwriter = new FileWriter(dest, false);
			BufferedWriter writer = new BufferedWriter(fwriter);
			writer.write(filecontents);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void change(String id, Double value) {
		int iindex = filecontents.indexOf("\"" + id + "\"");
		int cindex = filecontents.indexOf(":", iindex);
		int coindex = filecontents.indexOf(",", cindex);
		String fsplit = filecontents.substring(0, cindex+1);
		String ssplit = filecontents.substring(coindex);
		//System.out.println(fsplit);
		filecontents = fsplit + value + ssplit;
		FileWriter fwriter;
		try {
			fwriter = new FileWriter(dest, false);
			BufferedWriter writer = new BufferedWriter(fwriter);
			writer.write(filecontents);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void change(String id, String value) {
		int iindex = filecontents.indexOf("\"" + id + "\"");
		int cindex = filecontents.indexOf(":", iindex);
		int coindex = filecontents.indexOf(",", cindex);
		String fsplit = filecontents.substring(0, cindex+1);
		String ssplit = filecontents.substring(coindex);
		//System.out.println(fsplit);
		filecontents = fsplit + value + ssplit;
		FileWriter fwriter;
		try {
			fwriter = new FileWriter(dest, false);
			BufferedWriter writer = new BufferedWriter(fwriter);
			writer.write(filecontents);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Integer getValue(String id) {
		int iindex = filecontents.indexOf("\"" + id + "\"");
		int cindex = filecontents.indexOf(":", iindex);
		int coindex = filecontents.indexOf(",", cindex);
		
		return Integer.parseInt(filecontents.substring(cindex+1, coindex));
	}
}
