
public class ActionLists {
	
	/*
	 * Format: Index 0: {JSON key, multiplier}
	 * Index 1+: {folder, file name}
	 * Specify the main directories you are dealing with. 
	 * srcdir: Where the source files are. The directories in the arrays are concatenated on this to find the files themselves
	 * basedir: the folder where you want the mod to be placed
	 * moddir: extension for basedir so you don't have to type out so much in the arrays
	 * Be careful when typing these out, an error could cause the program to create a whole bunch of new folders where you don't want them
	 * If specified correctly, all folders in the mod directory should be created for you. Replace the username in basedir 
	 * and run it for a working example
	 */
	
	public static final String srcdir = "C:\\Program Files (x86)\\Uber Entertainment\\Planetary Annihilation Launcher\\Planetary Annihilation\\stable\\media\\pa\\units\\";
	public static final String basedir = "C:\\Users\\USERNAME\\AppData\\Local\\Uber Entertainment\\Planetary Annihilation\\server_mods\\";
	public static final String moddir = "com.nixtempestas.antipopcorn\\pa\\units\\";
	
	public static String[][] max_health_change = {
		{"max_health", "2"},
		{"air\\air_scout\\" , "air_scout.json"},
		{"air\\bomber\\", "bomber.json"},
		{"air\\bomber_adv\\", "bomber_adv.json"},
		{"air\\fabrication_aircraft\\", "fabrication_aircraft.json"},
		{"air\\fabrication_aircraft_adv\\", "fabrication_aircraft_adv.json"},
		{"air\\fighter\\", "fighter.json"},
		{"air\\gunship\\", "gunship.json"},
		{"air\\transport\\", "transport.json"},
		{"land\\aa_missile_vehicle\\", "aa_missile_vehicle.json"},
		{"land\\assault_bot\\", "assault_bot.json"},
		{"land\\assault_bot_adv\\", "assault_bot_adv.json"},
		{"land\\bot_aa\\", "bot_aa.json"},
		{"land\\bot_bomb\\", "bot_bomb.json"},
		{"land\\bot_grenadier\\", "bot_grenadier.json"},
		{"land\\bot_sniper\\", "bot_sniper.json"},
		{"land\\bot_tactical_missile\\", "bot_tactical_missile.json"},
		{"land\\fabrication_bot\\", "fabrication_bot.json"},
		{"land\\fabrication_bot_adv\\", "fabrication_bot_adv.json"},
		{"land\\fabrication_bot_combat\\", "fabrication_bot_combat.json"},
		{"land\\fabrication_bot_combat_adv\\", "fabrication_bot_combat_adv.json"},
		{"land\\fabrication_vehicle\\", "fabrication_vehicle.json"},
		{"land\\fabrication_vehicle_adv\\", "fabrication_vehicle_adv.json"},
		{"land\\land_scout\\", "land_scout.json"},
		//{"land\\tank_armor\\", "tank_armor.json"},
		//{"land\\tank_heavy_armor\\", "tank_heavy_armor.json"},
		{"land\\tank_heavy_mortar\\", "tank_heavy_mortar.json"},
		{"land\\tank_laser_adv\\", "tank_laser_adv.json"},
		{"land\\tank_light_laser\\", "tank_light_laser.json"},
		{"orbital\\orbital_fabrication_bot\\", "orbital_fabrication_bot.json"},
		{"orbital\\orbital_fighter\\", "orbital_fighter.json"},
		{"orbital\\orbital_lander\\", "orbital_lander.json"},
		{"orbital\\orbital_laser\\", "orbital_laser.json"},
		{"orbital\\radar_satellite\\", "radar_satellite.json"},
		{"orbital\\radar_satellite_adv\\", "radar_satellite_adv.json"},
		{"orbital\\solar_array\\", "solar_array.json"},
		{"sea\\battleship\\", "battleship.json"},
		{"sea\\destroyer\\", "destroyer.json"},
		{"sea\\fabrication_ship\\", "fabrication_ship.json"},
		{"sea\\fabrication_ship_adv\\", "fabrication_ship_adv.json"},
		{"sea\\frigate\\", "frigate.json"},
		{"sea\\missile_ship\\", "missile_ship.json"},
		//{"commanders\\base_commander\\", "base_commander.json"},
		{"sea\\sea_scout\\", "sea_scout.json"}
	};
	
	public static String[][] damage_change = {
		{"damage", "2"},
		{"land\\air_defense\\", "air_defense_ammo.json"},
		{"land\\air_defense_adv\\", "air_defense_adv_ammo.json"},
		{"land\\artillery_long\\", "artillery_long_ammo.json"},
		{"land\\artillery_short\\", "artillery_short_ammo.json"},
		{"land\\laser_defense\\", "laser_defense_ammo.json"},
		{"land\\laser_defense_adv\\", "laser_defense_adv_ammo.json"},
		{"land\\tactical_missile_launcher\\", "tactical_missile_launcher_ammo.json"},
		{"land\\laser_defense_single\\", "laser_defense_single_ammo.json"},
		{"orbital\\defense_satellite\\", "defense_satellite_ammo.json"},
		{"orbital\\ion_defense\\", "ion_defense_ammo.json"},
		{"sea\\torpedo_launcher\\", "torpedo_launcher_ammo.json"},
		{"sea\\torpedo_launcher_adv\\", "torpedo_launcher_adv_ammo.json"},
		{"commanders\\base_commander\\", "base_commander_ammo.json"},
		{"commanders\\base_commander\\", "base_commander_aa_ammo.json"},
		{"commanders\\base_commander\\", "base_commander_torpedo_ammo.json"}
	};
	
	public static String[][] splash_damage_change = {
		{"splash_damage", "2"},
		{"land\\air_defense_adv\\", "air_defense_adv_ammo.json"},
		{"land\\artillery_long\\", "artillery_long_ammo.json"},
		{"commanders\\base_commander\\", "base_commander_aa_ammo.json"},
		{"land\\artillery_short\\", "artillery_short_ammo.json"}
	};
	
	public static String[][] armour_change = {
		{"max_health", "1.5"},
		{"land\\tank_armor\\", "tank_armor.json"},
		{"land\\tank_heavy_armor\\", "tank_heavy_armor.json"}
	};
	
	public static String[][] cfabber_cost_change = {
		{"build_metal_cost", "0.5"},
		{"land\\fabrication_bot_combat\\", "fabrication_bot_combat.json"},
		{"land\\fabrication_bot_combat_adv\\", "fabrication_bot_combat_adv.json"}
	};
	
	public static String[][] fab_range_change = {
		{"max_range", "2"},
		{"land\\fabrication_bot_combat\\", "fabrication_bot_combat_build_arm.json"},
		{"land\\fabrication_bot_combat_adv\\", "fabrication_bot_combat_adv_build_arm.json"}
	};
	
	/*
	 * Override Format: 
	 * index 0: JSON key
	 * index 1+: dir, file name, value
	 */
	public static String[][] override_health = {
		{"max_health"},
		{"land\\tank_armor\\", "tank_armor.json", "1500"},
		{"land\\tank_heavy_armor\\", "tank_heavy_armor.json", "1500"}
	};
	
	public static String[][] path_override_damage = {
		{"damage", "2"},
		{"C:\\Program Files (x86)\\Uber Entertainment\\Planetary Annihilation Launcher\\Planetary Annihilation\\stable\\media\\pa\\ammo\\cannon_uber\\",
			"C:\\Users\\Lyle\\AppData\\Local\\Uber Entertainment\\Planetary Annihilation\\server_mods\\com.nixtempestas.antipopcorn\\pa\\ammo\\cannon_uber\\",
			"cannon_uber.json"
		}
	};
	
	public static String[][] path_override_splash_damage = {
		{"splash_damage", "2"},
		{"C:\\Program Files (x86)\\Uber Entertainment\\Planetary Annihilation Launcher\\Planetary Annihilation\\stable\\media\\pa\\ammo\\cannon_uber\\",
			"C:\\Users\\Lyle\\AppData\\Local\\Uber Entertainment\\Planetary Annihilation\\server_mods\\com.nixtempestas.antipopcorn\\pa\\ammo\\cannon_uber\\",
			"cannon_uber.json"}
	};
	
	
	public static String[][][] action_list = {
		max_health_change,
		damage_change,
		splash_damage_change,
		armour_change,
		cfabber_cost_change,
		fab_range_change
	};
	
	public static String[][][] path_overrides = {
		path_override_damage,
		path_override_splash_damage
	};
	
	public static String[][][] absolute_overrides = {
		//override_health
	};
}
