

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
		if (ActionLists.v1) {
			executeV1();
		} else {
			FileTree src = new FileTree(ActionLists.srcdir);
			//FileTree mod = new FileTree(ActionLists.moddir);
			for (int i=0; i<ActionLists.multiplier_list.length; i++) {
				for (int j=1; j<ActionLists.multiplier_list[i].length; j++) {
					String srcpath = src.search(ActionLists.multiplier_list[i][j][0]).getPath();
					String modext = srcpath.substring(ActionLists.srcdir.length());
					System.out.print(modext);
					ValueChanger vc = new ValueChanger(srcpath, ActionLists.moddir + modext);
					if (ActionLists.multiplier_list[i][j].length == 2) {
						System.out.println(" | " + ActionLists.multiplier_list[i][0][0] + " * " + ActionLists.multiplier_list[i][j][1]);
						vc.change(ActionLists.multiplier_list[i][0][0],
								(int) (Double.parseDouble(ActionLists.multiplier_list[i][j][1])*vc.getValue(ActionLists.multiplier_list[i][0][0])));
					} else {
						System.out.println(" | " + ActionLists.multiplier_list[i][0][0] + " * " + ActionLists.multiplier_list[i][0][1]);
						vc.change(ActionLists.multiplier_list[i][0][0],
								(int) (Double.parseDouble(ActionLists.multiplier_list[i][0][1])*vc.getValue(ActionLists.multiplier_list[i][0][0])));
					
					}
				}
			}
			for (int i=0; i<ActionLists.absolute_list.length; i++) {
				for (int j=1; j<ActionLists.absolute_list[i].length; j++) {
					String srcpath = src.search(ActionLists.absolute_list[i][j][0]).getPath();
					String modext = srcpath.substring(ActionLists.srcdir.length());
					System.out.print(modext);
					ValueChanger vc = new ValueChanger(srcpath, ActionLists.moddir + modext);
					if (ActionLists.absolute_list[i][j].length == 2) {
						System.out.println(" | " + ActionLists.absolute_list[i][0][0] + " -> " + ActionLists.absolute_list[i][j][1]);
						vc.change(ActionLists.absolute_list[i][0][0], ActionLists.absolute_overrides[i][j][1]);
					} else {
						System.out.println(" | " + ActionLists.absolute_list[i][0][0] + " -> " + ActionLists.absolute_list[i][0][1]);
						vc.change(ActionLists.absolute_list[i][0][0], ActionLists.absolute_overrides[i][0][1]);
					}
				}
			}
		}
			
		
	}
	
	private static void executeV1() {
		//Main loop to act on main action list. 
		for (int k=0; k<ActionLists.action_list.length; k++) {
			for (int i=1; i<ActionLists.action_list[k].length; i++) {
				System.out.println(ActionLists.action_list[k][i][1]);
				ValueChanger vc = new ValueChanger(ActionLists.srcdir + ActionLists.action_list[k][i][0] + ActionLists.action_list[k][i][1],
						ActionLists.basedir + ActionLists.moddir + ActionLists.action_list[k][i][0] + ActionLists.action_list[k][i][1]);
				vc.change(ActionLists.action_list[k][0][0],
						(int) (Double.parseDouble(ActionLists.action_list[k][0][1])*vc.getValue(ActionLists.action_list[k][0][0])));
			}
		}
		
		for (int k=0; k<ActionLists.path_overrides.length; k++) {
			for (int i=1; i<ActionLists.path_overrides[k].length; i++) {
				System.out.println(ActionLists.path_overrides[k][i][2]);
				ValueChanger vc = new ValueChanger(ActionLists.path_overrides[k][i][0] + 
						ActionLists.path_overrides[k][i][2],
						ActionLists.path_overrides[k][i][1] + ActionLists.path_overrides[k][i][2]);
				vc.change(ActionLists.path_overrides[k][0][0],
						(int) (Double.parseDouble(ActionLists.path_overrides[k][0][1])*vc.getValue(ActionLists.path_overrides[k][0][0])));
			}
		}
		
		//Loop for manual overrides for values you don't want to perform a broad stroke to. 
		for (int k=0; k<ActionLists.absolute_overrides.length; k++) {
			for (int i=1; i<ActionLists.absolute_overrides[k].length; i++) {
				System.out.println(ActionLists.absolute_overrides[k][i][1]);
				ValueChanger vc = new ValueChanger(ActionLists.srcdir + ActionLists.absolute_overrides[k][i][0] + ActionLists.absolute_overrides[k][i][1], 
						ActionLists.basedir + ActionLists.moddir + ActionLists.absolute_overrides[k][i][0] + ActionLists.absolute_overrides[k][i][1]);
				vc.change(ActionLists.absolute_overrides[k][0][0], ActionLists.absolute_overrides[k][i][2]);
			}
		}
	}
}
