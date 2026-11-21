/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettercomplementations.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.bettercomplementations.BettercomplementationsMod;

@EventBusSubscriber
public class BettercomplementationsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BettercomplementationsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BettercomplementationsModItems.AMETHYST_ARMOR_HELMET.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_ARMOR_CHESTPLATE.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_ARMOR_LEGGINGS.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_ARMOR_BOOTS.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BettercomplementationsModItems.AMETHYST_PICKAXE.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_AXE.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_SHOVEL.get());
			tabData.accept(BettercomplementationsModItems.AMETHYST_HOE.get());
		}
	}
}