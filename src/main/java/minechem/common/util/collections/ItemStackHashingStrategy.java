package minechem.common.util.collections;

import net.minecraft.item.ItemStack;

import java.util.Objects;

import gnu.trove.strategy.HashingStrategy;

public class ItemStackHashingStrategy implements HashingStrategy<ItemStack> {

	private static final long serialVersionUID = 1L;

	@Override
	public int computeHashCode(ItemStack stack) {
		return Objects.hash(stack.getItem(), stack.getCount(), stack.getItemDamage(), stack.getTagCompound());
	}

	@Override
	public boolean equals(ItemStack stack1, ItemStack stack2) {
		return ItemStack.areItemStacksEqual(stack1, stack2) && ItemStack.areItemStackTagsEqual(stack1, stack2);
	}
}