package me.creepinson.Main;

import me.creepinson.item.ItemHandler;

public class ClientProxy extends CommonProxy {
	public void registerRenderInfo(){
		ItemHandler.registerRenders();
	}
	public void init() {
		  ItemHandler.registerRenders();
		 }
	
	
}
