import java.io.File;
import java.util.ArrayList;


public class FileNode {
	private String name;
	private File file;
	private ArrayList<FileNode> children;
	private FileNode parent;
	
	public FileNode(String name) {
		this.name = name;
		this.children = new ArrayList<FileNode>();
		this.parent = null;
		this.file = null;
	}
	public FileNode(String name, File file) {
		this.name = name;
		this.children = new ArrayList<FileNode>();
		this.parent = null;
		this.file = file;
	}
	
	public String getName() {return name;}
	public File getFile() {return file;}
	private void setFile(File file) {this.file = file;}
	public void setName(String name) {this.name = name;}
	public FileNode getParent() {return parent;}
	private void setParent(FileNode parent) {this.parent = parent;}
	public void addChild(FileNode child) {
		child.setParent(this);
		child.setFile(new File(this.file.getAbsolutePath() + "\\" + child.getName())) ;
		this.children.add(child);
	}
	public void removeChild(FileNode child) {
		child.setParent(null);
		this.children.remove(child);
	}
	public FileNode search(String name) {
		if (this.getName().equals(name)) 
			return this;
		for (int i=0; i<this.children.size(); i++) {
			FileNode ret = null;
			ret = this.children.get(i).search(name);
			if (ret != null)
				return ret;
		}
		return null;
	}
	
	public String getPath() {
		return file.getAbsolutePath();
	}
}
