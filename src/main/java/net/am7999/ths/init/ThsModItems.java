
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.am7999.ths.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.am7999.ths.item.SocksColorPinkItem;
import net.am7999.ths.item.SocksColor1Item;
import net.am7999.ths.item.SocksColor0Item;
import net.am7999.ths.item.CottonItem;
import net.am7999.ths.ThsMod;

public class ThsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThsMod.MODID);
	public static final RegistryObject<Item> SOCKS_COLOR_WHITE_LEGGINGS = REGISTRY.register("socks_color_white_leggings",
			() -> new SocksColor0Item.Leggings());
	public static final RegistryObject<Item> COTTON = REGISTRY.register("cotton", () -> new CottonItem());
	public static final RegistryObject<Item> SOCKS_COLOR_MW_LEGGINGS = REGISTRY.register("socks_color_mw_leggings",
			() -> new SocksColor1Item.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_PINK_LEGGINGS = REGISTRY.register("socks_color_pink_leggings",
			() -> new SocksColorPinkItem.Leggings());
}
