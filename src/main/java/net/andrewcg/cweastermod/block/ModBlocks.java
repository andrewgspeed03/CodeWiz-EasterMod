package net.andrewcg.cweastermod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.andrewcg.cweastermod.CWEasterMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block EGG_BLOCK = registerBlock("egg_block",
        new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK)));


    public static Block registerBlock(String name, Block block){
        registerBlock(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CWEasterMod.MOD_ID, name), block);
    }
    
    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(CWEasterMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        CWEasterMod.LOGGER.info("Registering ModBlocks for " + CWEasterMod.MOD_ID);
    }
}
