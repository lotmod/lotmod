
package net.mcreator.lotmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.lotmod.item.KamienItem;
import net.mcreator.lotmod.LotmodModElements;

@LotmodModElements.ModElement.Tag
public class LotmodcrItemGroup extends LotmodModElements.ModElement {
	public LotmodcrItemGroup(LotmodModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablotmodcr") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KamienItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
