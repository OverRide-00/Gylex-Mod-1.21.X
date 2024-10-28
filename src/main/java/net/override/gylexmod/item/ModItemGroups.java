package net.override.gylexmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.override.gylexmod.GylexMod;

public class ModItemGroups {
    public static final ItemGroup CDM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GylexMod.MOD_ID, "cmd_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLATINUM_COIN))
                    .displayName(Text.translatable("itemgroup.gylexmod.cmd_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PLATINUM_COIN);
                        entries.add(ModItems.SILVER_COIN);
                        entries.add(ModItems.COPPER_COIN);
                    }).build());

    public static final ItemGroup PERMIT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GylexMod.MOD_ID, "permit_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DIAMOND_PERMIT))
                    .displayName(Text.translatable("itemgroup.gylexmod.permit_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLANK_PERMIT);
                        entries.add(ModItems.DIAMOND_PERMIT);
                        entries.add(ModItems.GOLD_PERMIT);
                        entries.add(ModItems.IRON_PERMIT);
                    }).build());



    public static void registerItemGroups() {
        GylexMod.LOGGER.info("Registering Item Groups for " + GylexMod.MOD_ID);
    }
}
