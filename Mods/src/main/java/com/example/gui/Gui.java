package com.example.gui;



import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.core.lookup.ResourceBundleLookup;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class Gui extends GuiScreen {
    private final int getHeant = 192;
    private final int getw = 256;
    private static ResourceLocation guiTexture;

    public Gui() {
        guiTexture = new ResourceLocation("examplemod:textures/gui/tutgui.png");
    }

    private String formatString(String s) {
        return s.replaceAll("NL", "\n\n");
    }
    @Override
    public void initGui(){
        Keyboard.enableRepeatEvents(true);
    }
    @Override
    public void updateScreen(){
        super.updateScreen();
    }

    @Override
    public void drawScreen(int w, int h,float p_73863_3_) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        mc.getTextureManager().bindTexture(guiTexture);
        int offsetFromSreenLeft = (width - getw) /2;
        drawTexturedModalRect(offsetFromSreenLeft, 2, 0,0, getw, getHeant);
        fontRenderer.drawString("bjdsfbgjhdhbngj", offsetFromSreenLeft + getw - 50,170,0);
    }
    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX,mouseY,mouseButton);
    }
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
