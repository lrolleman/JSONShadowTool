import java.io.File;


public class FileTree {
	String rootdir;
	FileNode root;
	
	public FileTree(String rootdir) {
		this.rootdir = rootdir;
		int index = rootdir.lastIndexOf("\\");
		root = new FileNode(rootdir.substring(index), new File(rootdir));
		buildTree(root);
	}
	
	public FileNode getRoot() {return root;}
	public String getRootDir() {return rootdir;}
	public FileNode search(String name) {
		return root.search(name);
	}
	private void buildTree(FileNode node) {
		File file = new File(node.getPath());
		File[] files = file.listFiles();
		for (int i=0; i<files.length; i++) {
			//System.out.println(files[i].getName());
			boolean valid = true;
			for (int j=0; j<ActionLists.excludelist.size(); j++) {
				if (files[i].getAbsolutePath().contains(ActionLists.excludelist.get(j))) {
					valid = false;
					break;
				}
			}
			if (valid) {
				FileNode child = new FileNode(files[i].getName());
				node.addChild(child);
				if (files[i].isDirectory())
					buildTree(child);
			}
		}
	}
}
