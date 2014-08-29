

/*
 * A simple, rather crude tool designed for the sole purpose of shadowing .json files for quick development of mods
 * Don't touch this file unless you know what you are doing, all the stuff you will need to touch for mod development pleasure
 * can be found in ActionList.java
 * Author: Lyle Rolleman (aka. nixtempestas)
 * This program can be used freely by anyone, I don't care for any of that copyright nonsense
 * 
 * READ ActionList.java COMMENTS BEFORE USING OR CHAOS MAY ENSUE. I am not responsible for any chaos this program causes.
 */

public class JSONShadow {
	

	public static void main(String[] args) {
			ActionLists.populateLists();
			FileTree src = new FileTree(ActionLists.srcdir);

			for (int i=0; i<ActionLists.mlist.size(); i++) {
				for (int j=1; j<ActionLists.mlist.get(i).size(); j++) {
					String srcpath = src.search(ActionLists.mlist.get(i).get(j).get(0)).getPath();
					String modext = srcpath.substring(ActionLists.srcdir.length());
					System.out.print(modext);
					ValueChanger vc = new ValueChanger(srcpath, ActionLists.moddir + modext);
					if (ActionLists.mlist.get(i).get(j).size() == 2) {
						System.out.println(" | " + ActionLists.mlist.get(i).get(0).get(0) + " * " + ActionLists.mlist.get(i).get(j).get(1));
						vc.change(ActionLists.mlist.get(i).get(0).get(0),
								(int) (Double.parseDouble(ActionLists.mlist.get(i).get(j).get(1))*vc.getValue(ActionLists.mlist.get(i).get(0).get(0))));
					} else {
						System.out.println(" | " + ActionLists.mlist.get(i).get(0).get(0) + " * " + ActionLists.mlist.get(i).get(0).get(1));
						vc.change(ActionLists.mlist.get(i).get(0).get(0),
								(int) (Double.parseDouble(ActionLists.mlist.get(i).get(0).get(1))*vc.getValue(ActionLists.mlist.get(i).get(0).get(0))));
					
					}
				}
			}
			for (int i=0; i<ActionLists.alist.size(); i++) {
				for (int j=1; j<ActionLists.alist.get(i).size(); j++) {
					String srcpath = src.search(ActionLists.alist.get(i).get(j).get(0)).getPath();
					String modext = srcpath.substring(ActionLists.srcdir.length());
					System.out.print(modext);
					ValueChanger vc = new ValueChanger(srcpath, ActionLists.moddir + modext);
					if (ActionLists.alist.get(i).get(j).size() == 2) {
						System.out.println(" | " + ActionLists.alist.get(i).get(0).get(0) + " -> " + ActionLists.alist.get(i).get(j).get(1));
						vc.change(ActionLists.alist.get(i).get(0).get(0), ActionLists.alist.get(i).get(j).get(1));
					} else {
						System.out.println(" | " + ActionLists.alist.get(i).get(0).get(0) + " -> " + ActionLists.alist.get(i).get(0).get(1));
						vc.change(ActionLists.alist.get(i).get(0).get(0), ActionLists.alist.get(i).get(0).get(1));
					}
				}
			}
	}
}
