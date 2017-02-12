package me.creepinson.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	public static Item StickOfFire;

	 public static void init(){


		 StickOfFire = new StickOfFire("stickoffire", CreativeTabs.MATERIALS);

	 }
	 
	 public static void register(){
	  GameRegistry.register(StickOfFire);
	 }
	 
	 public static void registerRenders(){

	 }
	 
	 public static void registerRender(Item item){
			
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	 }
}
