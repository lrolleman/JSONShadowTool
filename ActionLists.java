
public class ActionLists {
	
	/*
	 * Format:
	 * index 0: {"JSON key", "multiplier"},
	 * index 1+: {".json file name", multiplier override} where the override is optional
	 * Be careful when typing these out, an error could cause the program to create a whole bunch of new folders where you don't want them
	 * If specified correctly, all folders in the mod directory should be created for you. Replace the username in basedir 
	 * and run it for a working example
	 */
	
	public static final boolean v1 = false;
	public static final String srcdir = "C:\\Program Files (x86)\\Uber Entertainment\\Planetary Annihilation Launcher\\Planetary Annihilation\\PTE\\media\\pa";
	public static final String moddir = "C:\\Users\\Lyle\\AppData\\Local\\Uber Entertainment\\Planetary Annihilation\\server_mods\\com.nixtempestas.antipopcorn\\pa";
	
	private static String[][] max_health_change = {
		{"max_health", "2"},
		{"air_scout.json"},
		{"bomber.json"},
		{"bomber_adv.json"},
		{"fabrication_aircraft.json"},
		{"fabrication_aircraft_adv.json"},
		{"fighter.json"},
		{"gunship.json"},
		{"transport.json"},
		{"aa_missile_vehicle.json"},
		{"assault_bot.json"},
		{"assault_bot_adv.json"},
		{"bot_aa.json"},
		{"bot_bomb.json"},
		{"bot_grenadier.json"},
		{"bot_sniper.json"},
		{"bot_tactical_missile.json"},
		{"fabrication_bot.json"},
		{"fabrication_bot_adv.json"},
		{"fabrication_bot_combat.json"},
		{"fabrication_bot_combat_adv.json"},
		{"fabrication_vehicle.json"},
		{"fabrication_vehicle_adv.json"},
		{"land_scout.json"},
		{"tank_heavy_mortar.json"},
		{"tank_laser_adv.json"},
		{"tank_light_laser.json"},
		{"orbital_fabrication_bot.json"},
		{"orbital_fighter.json"},
		{"orbital_lander.json"},
		{"orbital_laser.json"},
		{"radar_satellite.json"},
		{"radar_satellite_adv.json"},
		{"solar_array.json"},
		{"battleship.json"},
		{"destroyer.json"},
		{"fabrication_ship.json"},
		{"fabrication_ship_adv.json"},
		{"frigate.json"},
		{"missile_ship.json"},
		{"tank_armor.json", "1.5"},
		{"tank_heavy_armor.json", "1.5"},
		{"sea_scout.json"}
	};
	
	private static String[][] damage_change = {
		{"damage", "2"},
		{"air_defense_ammo.json"},
		{"air_defense_adv_ammo.json"},
		{"artillery_long_ammo.json"},
		{"artillery_short_ammo.json"},
		{"laser_defense_ammo.json"},
		{"laser_defense_adv_ammo.json"},
		{"tactical_missile_launcher_ammo.json"},
		{"laser_defense_single_ammo.json"},
		{"defense_satellite_ammo.json"},
		{"ion_defense_ammo.json"},
		{"torpedo_launcher_ammo.json"},
		{"torpedo_launcher_adv_ammo.json"},
		{"base_commander_ammo.json"},
		{"base_commander_aa_ammo.json"},
		{"base_commander_torpedo_ammo.json"},
		{"cannon_uber.json"}
	};
	
	private static String[][] splash_damage_change = {
		{"splash_damage", "2"},
		{"air_defense_adv_ammo.json"},
		{"artillery_long_ammo.json"},
		{"base_commander_aa_ammo.json"},
		{"artillery_short_ammo.json"},
		{"cannon_uber.json"}
	};
	
	private static String[][] cfabber_cost_change = {
		{"build_metal_cost", "0.5"},
		{"fabrication_bot_combat.json"},
		{"fabrication_bot_combat_adv.json"}
	};
	
	private static String[][] cfab_range_change = {
		{"max_range", "2"},
		{"fabrication_bot_combat_build_arm.json"},
		{"fabrication_bot_combat_adv_build_arm.json"}
	};
	
	
	/*
	 * override type, rather than multiply the value it just outright replaces it
	 * Format: 
	 * index 0: {JSON key, "value"},
	 * index 1+: {"JSON file", "override value"} where override value is optional
	 */
	
	private static String[][] uber_override = {
		{"damage", "1500"},
		{"cannon_uber"}
	};
	private static String[][] uber_splash_override = {
		{"splash_damage", "1500"},
		{"cannon_uber"}
	};
	
	public static String[][][] multiplier_list = {
		max_health_change,
		damage_change,
		splash_damage_change,
		cfabber_cost_change,
		cfab_range_change
	};
	
	public static String[][][] absolute_list = {
		//uber_override,
		//uber_splash_override
	};
	
	//deprecated
	public static String[][][] action_list;
	public static String[][][] path_overrides;
	public static String[][][] absolute_overrides;
	public static String basedir;
}
