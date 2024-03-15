package net.andrewcg.cweastermod.datagen;

import net.andrewcg.cweastermod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

public class ModLootTableProvider extends FabricBlockLootTableProvider{

    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void generate() {
       addDrop(ModBlocks.EGG_BLOCK);
    }
  
}
