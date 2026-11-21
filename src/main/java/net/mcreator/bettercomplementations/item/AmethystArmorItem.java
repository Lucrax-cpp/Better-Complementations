package net.mcreator.bettercomplementations.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.bettercomplementations.BettercomplementationsMod;

import java.util.Map;

public abstract class AmethystArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(15, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 3, ArmorType.BODY, 6), 10,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("block.amethyst_block.resonate")), 0.5f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("bettercomplementations:amethyst_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("bettercomplementations:amethyst_armor")));

	private AmethystArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends AmethystArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends AmethystArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends AmethystArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends AmethystArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.boots"), 2, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(Identifier.withDefaultNamespace("armor.boots"), 0.5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.MOVEMENT_EFFICIENCY, new AttributeModifier(Identifier.fromNamespaceAndPath(BettercomplementationsMod.MODID, "amethyst_armor_0.boots"), 1, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.build()));
		}
	}
}