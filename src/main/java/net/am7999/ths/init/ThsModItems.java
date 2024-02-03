
package net.am7999.ths.init;

import net.am7999.ths.item.CottonItem;
import net.am7999.ths.item.socks.normal.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.am7999.ths.ThsMod;

public class ThsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThsMod.MODID);
	public static final RegistryObject<Item> COTTON = REGISTRY.register("cotton", CottonItem::new);
	public static final RegistryObject<Item> SOCKS_COLOR_BLACK = REGISTRY.register("socks_color_black", SocksColorBlackItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_BLUE = REGISTRY.register("socks_color_blue", SocksColorBlueItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_BROWN = REGISTRY.register("socks_color_brown", SocksColorBrownItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_CYAN = REGISTRY.register("socks_color_cyan", SocksColorCyanItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_GREEN = REGISTRY.register("socks_color_green", SocksColorGreenItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_GREEN_WHITE = REGISTRY.register("socks_color_green_white", SocksColorGreenOWhiteItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_LIME = REGISTRY.register("socks_color_lime", SocksColorLimeItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_MAGENTA = REGISTRY.register("socks_color_magenta", SocksColorMagentaItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_ORANGE = REGISTRY.register("socks_color_orange", SocksColorOrangeItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_PINK = REGISTRY.register("socks_color_pink", SocksColorPinkItem.Leggings::new);
	public static final RegistryObject<Item> SOCKS_COLOR_WHITE = REGISTRY.register("socks_color_white", SocksColorWhiteItem.Leggings::new);
}
