
package net.am7999.ths.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.am7999.ths.init.ThsModTabs;

public class CottonItem extends Item {
	public CottonItem() {
		super(new Item.Properties().tab(ThsModTabs.TAB_SOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
