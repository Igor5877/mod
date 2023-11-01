package com.example;

import com.example.event.eventBlock;
import com.example.event.eventItems;
import net.minecraftforge.common.MinecraftForge;

public class RegListEvent {
    public static void init(){
        MinecraftForge.EVENT_BUS.register(new eventBlock());
    }
    public static void init1(){MinecraftForge.EVENT_BUS.register(new eventItems());}
}
