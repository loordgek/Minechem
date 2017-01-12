package minechem.todo.apparatus.prefab.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import net.minecraftforge.client.IItemRenderer;

import minechem.client.render.tile.TESRBase;

public class BasicItemRenderer implements IItemRenderer {
	private final TileEntity tileEntity;
	TESRBase tesr;

	public BasicItemRenderer(TESRBase tesr, TileEntity tileEntity) {
		this.tesr = tesr;
		this.tileEntity = tileEntity;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY) {
			GL11.glTranslatef(-0.5F, -0.0F, -0.5F);
		}
		tesr.renderTileEntityAt(this.tileEntity, 0.0D, -(tesr.yOffset / 3), 0.0D, 0.0625F);
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}
}