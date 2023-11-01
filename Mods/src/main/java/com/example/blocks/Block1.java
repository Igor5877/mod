package com.example.blocks;

import com.example.examplemod.ExampleMod;
import com.example.init.Inititltem;
import com.example.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Block1 extends Block implements IHasModel {
    public Block1(String gray, Material tnt) {
        super(tnt);

        setUnlocalizedName(gray);
        setRegistryName(gray);
        setCreativeTab(ExampleMod.NEW_TAB);

        InitBlocks.BLOCKS.add(this);
        Inititltem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
