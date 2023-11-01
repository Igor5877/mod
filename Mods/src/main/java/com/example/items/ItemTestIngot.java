package com.example.items;

import com.example.examplemod.ExampleMod;
import com.example.init.Inititltem;
import com.example.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
// їхні властивості

public class ItemTestIngot extends Item implements IHasModel {
    public ItemTestIngot(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ExampleMod.NEW_TAB);
        setMaxStackSize(15);

        Inititltem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
