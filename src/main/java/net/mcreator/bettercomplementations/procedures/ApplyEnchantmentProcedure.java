package net.mcreator.bettercomplementations.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ApplyEnchantmentProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack chestplate = ItemStack.EMPTY;
		chestplate = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy();
		if (chestplate.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, Identifier.parse("bettercomplementations:smelter")))) != 0) {
			if (entity.tickCount % 10 == 0) {
				if (hasEntityInInventory(entity, new ItemStack(Items.RAW_IRON))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
						_setstack.setCount(1);
						_player.getInventory().placeItemBackInInventory(_setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.RAW_IRON);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (hasEntityInInventory(entity, new ItemStack(Items.RAW_GOLD))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
						_setstack.setCount(1);
						_player.getInventory().placeItemBackInInventory(_setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.RAW_GOLD);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (hasEntityInInventory(entity, new ItemStack(Items.RAW_COPPER))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.COPPER_INGOT).copy();
						_setstack.setCount(1);
						_player.getInventory().placeItemBackInInventory(_setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.RAW_COPPER);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}