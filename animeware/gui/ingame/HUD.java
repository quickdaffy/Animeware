package animeware.gui.ingame;

import animeware.Animeware;
import animeware.util.DrawUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class HUD extends GuiIngame {
    private Minecraft mc = Minecraft.getMinecraft();
    private FontRenderer font = mc.fontRendererObj;



    private double x = 600;
    private double y = 300;

    private int healthColor;
    private int healthRect;


    public HUD(Minecraft mcIn) {
        super(mcIn);
    }

    @Override
    public void renderGameOverlay(float partialTicks) {
        super.renderGameOverlay(partialTicks);

        if(!mc.gameSettings.showDebugInfo) {
            //drawTargetHud();
            renderWatermark();
            renderthefuckinganimeAHHHHHHHHHHHHHHHHHHHHH();
        }
    }

    private void renderWatermark() {
        GlStateManager.pushMatrix();
        GlStateManager.translate(4, 4, 0);
        GlStateManager.scale(1.9, 1.9,1);
        GlStateManager.translate(-4, -4, 0);
        font.drawStringWithShadow("A", 4, 4, new Color(250, 73, 183, 255).getRGB());
        font.drawStringWithShadow("nimeware", 11, 4, -1);
        GlStateManager.popMatrix();
    }

    private void renderthefuckinganimeAHHHHHHHHHHHHHHHHHHHHH() {
        ScaledResolution sr = new ScaledResolution(mc);
        mc.getTextureManager().bindTexture(new ResourceLocation("animeware/hudimage.png"));
        this.drawModalRectWithCustomSizedTexture(4, sr.getScaledHeight() - 500, 500, 500, 500, 500, 500, 500);

        mc.getTextureManager().bindTexture(new ResourceLocation("animeware/unnamed.png"));
        this.drawModalRectWithCustomSizedTexture(sr.getScaledWidth() - 150, sr.getScaledHeight() - 150, 150, 150, 150, 150, 150, 150);

        mc.getTextureManager().bindTexture(new ResourceLocation("animeware/download.jpg"));
        this.drawModalRectWithCustomSizedTexture(sr.getScaledWidth() - 150, 0, 150, 150, 150, 150, 150, 150);

        mc.getTextureManager().bindTexture(new ResourceLocation("animeware/yes.png"));
        this.drawModalRectWithCustomSizedTexture(sr.getScaledWidth() / 2, sr.getScaledHeight() - 500, 300, 300, 300, 300, 300, 300);

        mc.getTextureManager().bindTexture(new ResourceLocation("animeware/no.png"));
        this.drawModalRectWithCustomSizedTexture(sr.getScaledWidth() / 2 - 150, sr.getScaledHeight() - 300, 300, 300, 300, 300, 300, 300);
    }

    public void drawPlayerHead(int x, int y, int width, EntityPlayerSP e) {
        GlStateManager.pushMatrix();
        float scale = width / 32;
        GlStateManager.scale(scale, scale, scale);
        Minecraft.getMinecraft().getTextureManager().bindTexture(e.getLocationSkin());
        GL11.glEnable(GL11.GL_BLEND);
        this.drawTexturedModalRect(x / scale, y / scale, 32, 32, 32, 32);
        GL11.glDisable(GL11.GL_BLEND);
        GlStateManager.popMatrix();
    }
}
