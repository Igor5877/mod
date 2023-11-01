package com.example.items;

import com.example.examplemod.ExampleMod;
import com.example.init.Inititltem;
import com.example.utils.interfaces.IHasModel;
import net.minecraft.item.Item;
// їхні властивості
public class ItemTestIngotor extends Item implements IHasModel {
    public ItemTestIngotor(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(ExampleMod.NEW_TAB);
        setMaxStackSize(64);

        Inititltem.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}