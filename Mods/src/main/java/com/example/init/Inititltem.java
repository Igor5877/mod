package com.example.init;

import com.example.items.ItemGUI;
import com.example.items.ItemTestIngot;
import com.example.items.ItemTestIngotor;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inititltem {
    public static final List<Item> ITEMS = new ArrayList<Item>();
//    пердмети
    public static final Item Test_in = new ItemTestIngot("test_in");
    public static final Item Fuck = new ItemTestIngotor("fuck");
    public static final Item GUI = new ItemGUI("gui");
}
