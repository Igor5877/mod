package com.example.event;

import com.example.blocks.InitBlocks;
import com.example.gui.Gui;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class eventItems {
    private boolean guiShown = false;

    @SubscribeEvent
    public void blockClick(PlayerInteractEvent.RightClickBlock event) {
        ItemStack is = event.getEntityPlayer().getHeldItem(EnumHand.MAIN_HAND);

        if (is != null && (is.getItem() == Items.AIR)){
            if(event.getWorld().getBlockState(event.getPos()).getBlock() == InitBlocks.Gray) {
                FMLCommonHandler.instance().showGuiScreen(new Gui());
            }
        }
    }
}
