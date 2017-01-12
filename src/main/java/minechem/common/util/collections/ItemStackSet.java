package minechem.common.util.collections;

import net.minecraft.item.ItemStack;

import gnu.trove.set.hash.TCustomHashSet;

public class ItemStackSet extends TCustomHashSet<ItemStack> {

	private static final ItemStackHashingStrategy HASHING_STRATEGY = new ItemStackHashingStrategy();
	private static final FlatItemStackHashingStrategy FLAT_HASHING_STRATEGY = new FlatItemStackHashingStrategy();

	public ItemStackSet() {
		this(false);
	}

	public ItemStackSet(boolean flat) {
		super(flat ? FLAT_HASHING_STRATEGY : HASHING_STRATEGY);
	}

	public ItemStackSet copy() {
		ItemStackSet copy = new ItemStackSet();
		copy.strategy = this.strategy;
		copy.addAll(this);
		return copy;
	}
}