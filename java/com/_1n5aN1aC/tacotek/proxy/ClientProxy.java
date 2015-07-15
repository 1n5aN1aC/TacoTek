package com._1n5aN1aC.tacotek.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com._1n5aN1aC.tacotek.common.RenderRegistrationHelper;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }
	
    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
        RenderRegistrationHelper.registerItemRenderer(this);
        RenderRegistrationHelper.registerBlockRenderer(this);
    }
    
    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
    
    @Override
	public void addName(Item internalName, String visibleName) {
		LanguageRegistry.addName(internalName, visibleName);
	}
    
    
	
	public String getSide() {
		return "Client";
	}

	public World getWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}

	public EntityPlayer getClientPlayer() {
		return FMLClientHandler.instance().getClient().thePlayer;
	}

	public void tick() {
		//Not Client Side
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// Only Server-side
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}