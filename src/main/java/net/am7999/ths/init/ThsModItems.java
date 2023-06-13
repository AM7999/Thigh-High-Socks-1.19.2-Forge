
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.am7999.ths.init;

import net.am7999.ths.item.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.am7999.ths.ThsMod;

public class ThsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThsMod.MODID);
	public static final RegistryObject<Item> SOCKS_COLOR_WHITE_LEGGINGS = REGISTRY.register("socks_color_white", () -> new SocksColorWhiteItem.Leggings());
	public static final RegistryObject<Item> COTTON = REGISTRY.register("cotton", () -> new CottonItem());
	public static final RegistryObject<Item> SOCKS_COLOR_PINK_LEGGINGS = REGISTRY.register("socks_color_pink", () -> new SocksColorPinkItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_LIME_LEGGINGS = REGISTRY.register("socks_color_lime", () -> new SocksColorLimeItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_ORANGE_LEGGINGS = REGISTRY.register("socks_color_orange", () -> new SocksColorOrangeItem.Leggings());
}
