package com.example.blocks;


import com.example.examplemod.ExampleMod;
import com.example.init.Inititltem;
import com.example.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class TestBlock extends Block implements IHasModel {
    public TestBlock(String name, Material material) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ExampleMod.NEW_TAB);
        setHardness(-1);
        setResistance(-1);
        setSoundType(SoundType.WOOD);

        InitBlocks.BLOCKS.add(this);
        Inititltem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
