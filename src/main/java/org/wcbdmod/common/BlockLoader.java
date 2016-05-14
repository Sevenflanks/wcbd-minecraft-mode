package org.wcbdmod.common;


import java.util.List;

import org.wcbdmod.elevator.block.ElevatorBlock;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 註冊方塊
 * @author Sevenflanks
 */
public class BlockLoader {
	
	public static final List<? extends Block> blocks = Lists.newArrayList(new ElevatorBlock());

	public static void init() {
		blocks.stream()
			.forEach(block -> GameRegistry.registerBlock(block, block.getUnlocalizedName()));
	};
	
}
