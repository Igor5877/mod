package com.example.tab;

import com.example.blocks.InitBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NewTab extends CreativeTabs  {
    public NewTab(String newTab) {
        super(newTab);
    }
//    іконка
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(InitBlocks.Vlad_t);
    }
}
