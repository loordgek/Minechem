package minechem.todo.common.compatibility.openblocks;

import net.minecraftforge.fml.common.event.FMLInterModComms;

import minechem.common.Compendium;
import minechem.todo.common.compatibility.CompatBase;

public class OpenBlocksCompat extends CompatBase {

	@Override
	protected void init() {
		FMLInterModComms.sendMessage(mod.getModId(), "donateUrl", Compendium.MetaData.patreon);
	}
}