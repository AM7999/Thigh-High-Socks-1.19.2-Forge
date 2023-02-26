
package net.am7999.ths.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ThsModTabs {
	public static CreativeModeTab TAB_SOCKS;

	public static void load() {
		TAB_SOCKS = new CreativeModeTab("tabsocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ThsModItems.SOCKS_COLOR_WHITE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
