package net.andrewcg.cweastermod.item;

import net.andrewcg.cweastermod.CWEasterMod;
import net.andrewcg.cweastermod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    
    public static final ItemGroup EASTER_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(CWEasterMod.MOD_ID, "easter"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.easter"))
            .icon(() -> new ItemStack(ModItems.EASTER_EGG)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.EGG_BLOCK);
            }).build());

    
    public static void registerItemGroups() {
        CWEasterMod.LOGGER.info("Registering Item Groups for " + CWEasterMod.MOD_ID);
    }
}
