

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
				System.out.println(ActionLists.path_overrides[k][i][1]);
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
