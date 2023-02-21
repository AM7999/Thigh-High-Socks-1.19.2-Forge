
package net.am7999.ths.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.am7999.ths.item.SocksColorWPIItem;
import net.am7999.ths.item.SocksColorRWItem;
import net.am7999.ths.item.SocksColorPinkwhiteItem;
import net.am7999.ths.item.SocksColorPinkItem;
import net.am7999.ths.item.SocksColor1Item;
import net.am7999.ths.item.SocksColor0Item;
import net.am7999.ths.item.CottonItem;
import net.am7999.ths.item.SocksColorGreenItem;
import net.am7999.ths.item.SocksColorLimeItem;
import net.am7999.ths.ThsMod;

public class ThsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThsMod.MODID);
	public static final RegistryObject<Item> SOCKS_COLOR_WHITE_LEGGINGS = REGISTRY.register("socks_color_white",
			() -> new SocksColor0Item.Leggings());
	public static final RegistryObject<Item> COTTON = REGISTRY.register("cotton", () -> new CottonItem());
	public static final RegistryObject<Item> SOCKS_COLOR_MW_LEGGINGS = REGISTRY.register("socks_color_mw",
			() -> new SocksColor1Item.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_PINK_LEGGINGS = REGISTRY.register("socks_color_pink",
			() -> new SocksColorPinkItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_PINKWHITE_LEGGINGS = REGISTRY.register("socks_color_pinkwhite",
			() -> new SocksColorPinkwhiteItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_RW_LEGGINGS = REGISTRY.register("socks_color_rw",
			() -> new SocksColorRWItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_WPI_LEGGINGS = REGISTRY.register("socks_color_wpi",
			() -> new SocksColorWPIItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_GREEN_LEGGINGS = REGISTRY.register("socks_color_green",
			() -> new SocksColorGreenItem.Leggings());
	public static final RegistryObject<Item> SOCKS_COLOR_LIME_LEGGINGS = REGISTRY.register("socks_color_lime",
	        () -> new SocksColorLimeItem.Leggings());
}
