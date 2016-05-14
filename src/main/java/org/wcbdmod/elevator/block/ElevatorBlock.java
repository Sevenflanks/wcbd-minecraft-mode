package org.wcbdmod.elevator.block;

import org.wcbdmod.common.WcbdUtilsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * 方塊定義檔-電梯
 * @author Sevenflanks
 */

public class ElevatorBlock extends Block {

	private static final String BLOCK_NAME = "elevator_block";

	public ElevatorBlock() {
		super(Material.rock);
		this.setUnlocalizedName(BLOCK_NAME); // 設定方塊名稱
		this.setCreativeTab(WcbdUtilsMod.TAB_WCBD_UTILS); // 設定在創造模式的標籤頁
		this.setHardness(10F); // 設定硬度
	}

}
