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

    public static final Item BLANK_PERMIT = registerItem("blank_permit", new Item(new Item.Settings()));
    public static final Item DIAMOND_PERMIT = registerItem("diamond_permit", new Item(new Item.Settings()));
    public static final Item GOLD_PERMIT = registerItem("gold_permit", new Item(new Item.Settings()));
    public static final Item IRON_PERMIT = registerItem("iron_permit", new Item(new Item.Settings()));



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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(BLANK_PERMIT);
            entries.add(DIAMOND_PERMIT);
            entries.add(GOLD_PERMIT);
            entries.add(IRON_PERMIT);
        });
    }
}
