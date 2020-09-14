
package net.mcreator.lotmod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.lotmod.LotmodModElements;

@LotmodModElements.ModElement.Tag
public class WegielFuel extends LotmodModElements.ModElement {
	public WegielFuel(LotmodModElements instance) {
		super(instance, 53);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.REDSTONE_WIRE, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
