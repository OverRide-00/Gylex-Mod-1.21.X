package net.override.gylexmod;

import net.fabricmc.api.ModInitializer;

import net.override.gylexmod.item.ModItemGroups;
import net.override.gylexmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GylexMod implements ModInitializer {
	public static final String MOD_ID = "gylexmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}