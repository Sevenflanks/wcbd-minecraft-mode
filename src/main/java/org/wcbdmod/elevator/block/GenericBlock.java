package org.wcbdmod.elevator.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GenericBlock extends Block {
	
	private String name;

	public GenericBlock(Material materialIn) {
		super(materialIn);
	}

	public String getName() {
		return name;
	}

	/**
	 * 註冊block時, 若使用UnlocalizedName, 則會被自動加上tile的前綴
	 * 為了避免這個機制造成resource命名的混亂
	 * 採用name取代這個機制
	 * @param name
	 */
	public void setName(String name) {
		this.setUnlocalizedName(name);
		this.name = name;
	}
	
}
