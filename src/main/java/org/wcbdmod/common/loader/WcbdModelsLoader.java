package org.wcbdmod.common.loader;

import java.util.List;

import org.wcbdmod.common.WcbdUtilsMod;
import org.wcbdmod.elevator.block.ElevatorBlock;
import org.wcbdmod.elevator.block.GenericBlock;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 處理本Mod裡所有Model的註冊 TODO: 要能自動抓取所有Model
 * 
 * @author Sevenflanks
 */
public class WcbdModelsLoader {

	public static final List<? extends GenericBlock> blocks = Lists.newArrayList(new ElevatorBlock());
	public static final List<? extends Item> items = Lists.newArrayList();

	// 將block的item型態註冊
	public static void regItemBlock(Block block) {
		final Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register
                (item, 0, new ModelResourceLocation(WcbdUtilsMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
	
	public static void initBlock() {
		for (GenericBlock block : blocks) {
			GameRegistry.registerBlock(block, block.getItemClass(), block.getName());
			regItemBlock(block);
		}
	};

	public static void initItem() {
		for (Item item : items) {
			GameRegistry.registerItem(item, item.getUnlocalizedName());
		}
	};

}
