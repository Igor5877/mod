package com.example.examplemod;

import com.example.RegListEvent;
import com.example.tab.NewTab;
import com.example.utils.handlers.RegisterHandlers;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import com.example.reference.Reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import com.example.proxy.ServerProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)
public class ExampleMod {

    @Instance
    public static ExampleMod instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static ServerProxy proxy;
//    креативна вкладка
    public static final CreativeTabs NEW_TAB = new NewTab("new_tab");

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegListEvent.init1();
        RegListEvent.init();
        proxy.preInit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        RegisterHandlers.otherRegister();
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
