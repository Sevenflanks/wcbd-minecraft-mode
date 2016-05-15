package org.wcbdmod.common;

import org.wcbdmod.common.proxy.GenericProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * 模組定義檔
 * 
 * @author Sevenflanks
 */

@Mod(modid = WcbdUtilsMod.MODID, version = WcbdUtilsMod.VERSION)
public class WcbdUtilsMod {
	// 模組ID定義
	public static final String MODID = "wcbdutils";

	// 模組版本定義
	public static final String VERSION = "0.1";

	// 模組實體
	@Mod.Instance(MODID)
	public static WcbdUtilsMod instance;

	// 模組定義關聯
	@SidedProxy(clientSide = "org.wcbdmod.common.proxy.ClientProxy", serverSide = "org.wcbdmod.common.proxy.ServerProxy")
	public static GenericProxy proxy;

	// 模組物件標籤頁
	public static final CreativeTabs TAB_WCBD_UTILS = new CreativeTabs("wcbdutils") {
		@Override
		public Item getTabIconItem() {
			// 設定標籤頁的Mark
			return Item.getItemFromBlock(Blocks.diamond_block);
		}
	};

	/**
	 * 建立、讀取 config
	 * @param evt
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// 
	}

	/**
	 * 註冊事件監聽；註冊 block、item；新增 Recipe
	 * @param event
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
