package org.wcbdmod.common.proxy;

import org.wcbdmod.common.loader.WcbdModelsLoader;

/**
 * 伺服端定義檔
 * @author Sevenflanks
 */

public class ServerProxy implements GenericProxy {

	@Override
	public void init() {
		WcbdModelsLoader.initBlock();
		WcbdModelsLoader.initItem();
	}

}
