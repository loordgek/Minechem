package minechem.common.item;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;

public interface IOverlay {

	void renderOverlay(FontRenderer fontRenderer, TextureManager textureManager, ItemStack stack, int left, int top, float z);

}
