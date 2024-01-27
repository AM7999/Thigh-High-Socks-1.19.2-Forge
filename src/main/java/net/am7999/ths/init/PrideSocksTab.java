
package net.am7999.ths.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PrideSocksTab {
    public static CreativeModeTab TAB_PRIDE;

    public static void load() {
        TAB_PRIDE = new CreativeModeTab("tabpride") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ThsModItems.SOCKS_COLOR_CYAN.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
