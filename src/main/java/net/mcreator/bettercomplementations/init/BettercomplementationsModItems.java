/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettercomplementations.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.bettercomplementations.item.*;
import net.mcreator.bettercomplementations.BettercomplementationsMod;

import java.util.function.Function;

public class BettercomplementationsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BettercomplementationsMod.MODID);
	public static final DeferredItem<Item> AMETHYST_ARMOR_HELMET;
	public static final DeferredItem<Item> AMETHYST_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> AMETHYST_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> AMETHYST_ARMOR_BOOTS;
	public static final DeferredItem<Item> AMETHYST_SWORD;
	public static final DeferredItem<Item> AMETHYST_PICKAXE;
	public static final DeferredItem<Item> AMETHYST_AXE;
	public static final DeferredItem<Item> AMETHYST_SHOVEL;
	public static final DeferredItem<Item> AMETHYST_HOE;
	static {
		AMETHYST_ARMOR_HELMET = register("amethyst_armor_helmet", AmethystArmorItem.Helmet::new);
		AMETHYST_ARMOR_CHESTPLATE = register("amethyst_armor_chestplate", AmethystArmorItem.Chestplate::new);
		AMETHYST_ARMOR_LEGGINGS = register("amethyst_armor_leggings", AmethystArmorItem.Leggings::new);
		AMETHYST_ARMOR_BOOTS = register("amethyst_armor_boots", AmethystArmorItem.Boots::new);
		AMETHYST_SWORD = register("amethyst_sword", AmethystSwordItem::new);
		AMETHYST_PICKAXE = register("amethyst_pickaxe", AmethystPickaxeItem::new);
		AMETHYST_AXE = register("amethyst_axe", AmethsytAxeItem::new);
		AMETHYST_SHOVEL = register("amethyst_shovel", AmethystShovelItem::new);
		AMETHYST_HOE = register("amethyst_hoe", AmethystHoeItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}