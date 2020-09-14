
package net.mcreator.lotmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.lotmod.procedures.DirtswordToolInInventoryTickProcedure;
import net.mcreator.lotmod.LotmodModElements;

import java.util.Map;
import java.util.HashMap;

@LotmodModElements.ModElement.Tag
public class DirtswordItem extends LotmodModElements.ModElement {
	@ObjectHolder("lotmod:dirtsword")
	public static final Item block = null;
	public DirtswordItem(LotmodModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 101;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3.3999999999999995f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIRT, (int) (1)));
			}
		}, 3, -2.5999999999999999f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					DirtswordToolInInventoryTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("dirtsword"));
	}
}
