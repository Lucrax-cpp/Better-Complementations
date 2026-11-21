package net.mcreator.bettercomplementations.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.bettercomplementations.init.BettercomplementationsModItems;
import net.mcreator.bettercomplementations.BettercomplementationsMod;

@EventBusSubscriber
public class AmethsytAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 750, 7f, 0, 17, TagKey.create(Registries.ITEM, Identifier.parse("bettercomplementations:amethyst_axe_repair_items")));

	public AmethsytAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -3.1f, properties);
	}

	@SubscribeEvent
	public static void modifyDefaultComponents(ModifyDefaultComponentsEvent event) {
		event.modify(BettercomplementationsModItems.AMETHYST_AXE.get(), (builder, _, _) -> builder.set(DataComponents.ATTRIBUTE_MODIFIERS,
				ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -3.1, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(BettercomplementationsMod.MODID, "amethyst_axe_0"), 1, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(Identifier.fromNamespaceAndPath(BettercomplementationsMod.MODID, "amethyst_axe_1"), 0.5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build()));
	}
}