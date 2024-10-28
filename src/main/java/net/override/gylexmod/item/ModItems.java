package net.override.gylexmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.override.gylexmod.GylexMod;

public class ModItems {
    public static final Item PLATINUM_COIN = registerItem("platinum_coin", new Item(new Item.Settings()));
    public static final Item SILVER_COIN = registerItem("silver_coin", new Item(new Item.Settings()));
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GylexMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GylexMod.LOGGER.info("Registering Mod Items for " + GylexMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PLATINUM_COIN);
            entries.add(SILVER_COIN);
            entries.add(COPPER_COIN);
        });
    }
}
