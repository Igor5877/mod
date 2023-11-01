package com.example.utils;

import com.example.blocks.InitBlocks;
import com.example.init.Inititltem;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {
    public static void registerRacipes() {
        GameRegistry.addSmelting(new ItemStack(Inititltem.Fuck), new ItemStack(Items.GOLD_INGOT),0.50F );
        GameRegistry.addSmelting(new ItemBlock(InitBlocks.Vlad_t), new ItemStack(Items.GOLD_INGOT), 5F );
    }
}
