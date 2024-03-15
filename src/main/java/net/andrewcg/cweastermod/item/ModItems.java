package net.andrewcg.cweastermod.item;

import net.andrewcg.cweastermod.CWEasterMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    public static final Item EASTER_EGG = registerItem("easter_egg", new Item(new FabricItemSettings()));


    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(EASTER_EGG);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CWEasterMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CWEasterMod.LOGGER.info("Registering Mod Items for " + CWEasterMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
