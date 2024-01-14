
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.am7999.ths.init;

import net.am7999.ths.item.socks.*;
import net.am7999.ths.item.CottonItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.am7999.ths.ThsMod;

public class ThsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThsMod.MODID);
	public static final RegistryObject<Item> COTTON = REGISTRY.register("cotton", () -> new CottonItem());
	public static final RegistryObject<Item> SOCKS_COLOR_BLACK = REGISTRY.register("socks_color_black", () -> new SocksColorBlackItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_BROWN = REGISTRY.register("socks_color_brown", () -> new SocksColorBrownItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_CYAN = REGISTRY.register("socks_color_cyan", () -> new SocksColorCyanItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_GREEN = REGISTRY.register("socks_color_green", () -> new SocksColorGreenItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_LIME = REGISTRY.register("socks_color_lime", () -> new SocksColorLimeItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_ORANGE = REGISTRY.register("socks_color_orange", () -> new SocksColorOrangeItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_PINK = REGISTRY.register("socks_color_pink", () -> new SocksColorPinkItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_WHITE = REGISTRY.register("socks_color_white", () -> new SocksColorWhiteItem.Leggings());
}
