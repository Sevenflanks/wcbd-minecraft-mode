package org.wcbdmod.common.loader;

import java.util.List;

import org.wcbdmod.common.WcbdUtilsMod;
import org.wcbdmod.elevator.block.ElevatorBlock;
import org.wcbdmod.elevator.block.GenericBlock;

import com.google.common.collect.Lists;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 處理本Mod裡所有Model的註冊 TODO: 要能自動抓取所有Model
 * 
 * @author Sevenflanks
 */
public class WcbdModelsLoader {

	private static final int DEFAULT_ITEM_SUBTYPE = 0;

	public static final List<? extends GenericBlock> blocks = Lists.newArrayList(new ElevatorBlock());
	public static final List<? extends Item> items = Lists.newArrayList();

	public static void initBlock() {
		for (GenericBlock block : blocks) {
			GameRegistry.registerBlock(block, block.getName());
			Item itemBlockSimple = GameRegistry.findItem(WcbdUtilsMod.MODID, block.getName());
			ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(WcbdUtilsMod.MODID + ":" + block.getName(), "inventory");
			ModelLoader.setCustomModelResourceLocation(itemBlockSimple, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
		}
	};

	public static void initItem() {
		for (Item item : items) {
			GameRegistry.registerItem(item, item.getUnlocalizedName());
		}
	};

}
