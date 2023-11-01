package com.example.items;

import com.example.examplemod.ExampleMod;
import com.example.init.Inititltem;
import com.example.utils.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemGUI extends Item implements IHasModel {
    public ItemGUI(String gui) {
        setRegistryName(gui);
        setUnlocalizedName(gui);
        setCreativeTab(ExampleMod.NEW_TAB);

        Inititltem.ITEMS.add(this);

    }
    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
