package com.example.gui;

import com.example.items.ItemTestIngotor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;


public class ItemOpenGui extends ItemTestIngotor {
    public ItemOpenGui(String name, int maxStackSize) {
        super(name);
    }
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        if (!world.isRemote) {
            FMLCommonHandler.instance().showGuiScreen(new Gui());
        }
        return EnumActionResult.PASS;
    }
}
