package com.example.event;

import com.example.gui.Gui;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;

public class eventBlock {
    private boolean guiShown = false;

    @SubscribeEvent
    public void blockClick(PlayerInteractEvent.RightClickBlock event) {
        ItemStack is = event.getEntityPlayer().getHeldItem(EnumHand.MAIN_HAND);

        if (is != null && (is.getItem() == Items.CARROT)){
            if(event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.GRASS) {
                event.getWorld().setBlockState(event.getPos(), Blocks.BEDROCK.getDefaultState());
                if (!guiShown) {
                    FMLCommonHandler.instance().showGuiScreen(new Gui());
                    guiShown = true; // Позначаємо, що `Gui` було показано
                }
            } else {
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Ваше повідомлення"));
                FMLCommonHandler.instance().showGuiScreen(new Gui());
            }
        }
    }
}
